public class AccountHandler {
	public static Account insertNewAccount(String inputAccountName)
    {
		try
        {
            Account acc = new Account(Name = inputAccountName);
            insert acc;
            return acc;
        }
        catch (Dmlexception e)
        {
            return null;
        }
    }
}