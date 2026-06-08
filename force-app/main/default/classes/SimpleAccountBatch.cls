public class SimpleAccountBatch implements Database.Batchable<sObject> {

    public Database.QueryLocator start(Database.BatchableContext bc) {
        return Database.getQueryLocator('SELECT Id, Name FROM Account');
    }

    public void execute(Database.BatchableContext bc, List<Account> scope) {
        for (Account acc : scope) {
            acc.Description = 'Processed by batch';
        }
        update scope;
    }

    public void finish(Database.BatchableContext bc) {
        System.debug('All done!');
    }
}



// real time example for batch