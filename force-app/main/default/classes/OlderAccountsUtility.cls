public class OlderAccountsUtility {
	public static void updateOlderAccounts()
    {
        Account[] oldAccounts = [ Select id , Description From Account ORDER BY CreatedDate ASC LIMIT 5 ];
        
        for ( Account acc : oldAccounts)
        {
            acc.Description = 'Heritage Account';
        }
        
        update oldAccounts;
    }
}