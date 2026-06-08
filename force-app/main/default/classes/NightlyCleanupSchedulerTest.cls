@isTest
private class NightlyCleanupSchedulerTest {

    @isTest
    static void testScheduler() {
        Account acc = new Account(Name = 'Test Co');
        insert acc;

        Test.startTest();

        String cron = '0 0 2 * * ?'; //cron at 2am
        System.schedule('Test Cleanup Job', cron, new NightlyCleanupScheduler());

        Test.stopTest();

        Account result = [SELECT Description FROM Account WHERE Id = :acc.Id];
        System.assertEquals('Needs review', result.Description);
    }
}