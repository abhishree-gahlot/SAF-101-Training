public with sharing class AccountController {
    @AuraEnabled(cacheable=true)
    public static List<Account> getAccounts(){
        return [
            Select id , name 
            from Account
            Limit 10
        ];
    }
}