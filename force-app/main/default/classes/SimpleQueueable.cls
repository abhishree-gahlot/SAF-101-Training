public class SimpleQueueable implements Queueable {
	public void execute ( QueueableContext ctx)
    {
        List<Account> accounts = [ SELECT Id, Phone FROM Account WHERE Phone = null LIMIT 200 ];
        
        for (Account acc : accounts) { //adding placeholder 
            acc.Phone = '000-000-0000';
        }
        
        update accounts;
        System.debug('Queueable done! Updated ' + accounts.size() + ' accounts.');
    }
}