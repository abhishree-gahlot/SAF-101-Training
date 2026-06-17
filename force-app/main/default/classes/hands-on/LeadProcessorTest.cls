@isTest
private class LeadProcessorTest {

    @isTest
    static void testLeadProcessorBatch()
    {
        List<Lead> leadsToInsert = new List<Lead>();

        for(Integer i = 0; i < 200; i++)
        {
            leadsToInsert.add(
                new Lead(
                    LastName = 'Lead ' + i,
                    Company = 'Test Company'
                )
            );
        }

        insert leadsToInsert;

        Test.startTest();

        Database.executeBatch(
            new LeadProcessor()
        );

        Test.stopTest();

        List<Lead> updatedLeads =
        [
            SELECT Id, LeadSource
            FROM Lead
        ];

        System.assertEquals(
            200,
            updatedLeads.size()
        );

        for(Lead leadRecord : updatedLeads)
        {
            System.assertEquals(
                'Dreamforce',
                leadRecord.LeadSource
            );
        }
    }
}