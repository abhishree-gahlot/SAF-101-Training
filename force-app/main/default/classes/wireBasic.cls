public with sharing class wireBasic {
        
    @AuraEnabled(cacheable=True)
        public static string myMethod()
        {
            account acc = [Select id from account LIMIT 1];
            return acc.id;
        }
}