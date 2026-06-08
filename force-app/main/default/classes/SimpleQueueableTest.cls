@isTest
private class SimpleQueueableTest {

    @isTest
    static void testQueueable() {
        Account acc = new Account(Name = 'Test Co');
        insert acc;

        Test.startTest();
        System.enqueueJob(new SimpleQueueable());
        Test.stopTest();
	
        Account result = [SELECT Phone FROM Account WHERE Id = :acc.Id];
        System.assertEquals('000-000-0000', result.Phone);
    }
}