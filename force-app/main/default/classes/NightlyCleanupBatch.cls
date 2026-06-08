public class NightlyCleanupBatch implements Database.Batchable<sObject> 
{
    public Database.QueryLocator start(Database.BatchableContext bc) {
        return Database.getQueryLocator(
         	'SELECT Id, Description FROM Account WHERE Description = null'
        );
    }

    public void execute(Database.BatchableContext bc, List<Account> scope) {
        for (Account acc : scope) {
            acc.Description = 'Needs review';
        }
        update scope;
    }

    public void finish(Database.BatchableContext bc) {
        System.debug('Nightly cleanup done!');
    }
}