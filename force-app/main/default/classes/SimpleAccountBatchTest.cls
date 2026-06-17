@isTest
private class SimpleAccountBatchTest {

    @isTest
    static void testBatch() {
        Account acc = new Account(Name = 'Test Account');
        insert acc;

        Test.startTest();
        Database.executeBatch(new SimpleAccountBatch());
        Test.stopTest();

        Account result = [SELECT Description FROM Account WHERE Id = :acc.Id];
        System.assertEquals('Processed by batch', result.Description);
    }
}