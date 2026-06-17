// Create an Apex class that uses the @future annotation to update Account records.
// Create an Apex class with a future method that accepts a List of Account IDs and 
// updates a custom field on the Account object with the number of contacts associated to the Account.
// Write unit tests that achieve 100% code coverage for the class. 

// a better solution to this would be using : queueable  / batch 
public with sharing class AccountProcessor {
    @future
    public static void countContacts ( List<Id> accountIds) 
    {
        Map<Id , Integer> contactCountMap = new Map<Id , Integer>();

        //query to return like : A1 => 2 , A2 => 3 
        // now this returns AggregateResult Records
        List <AggregateResult> results =  [ Select AccountId accId, COUNT(Id) contactCounts //aliasing
            FROM Contact 
            WHERE AccountId in :accountIds 
            GROUP BY AccountId] 
        ;    

        // putting the result in map
        for(AggregateResult result : results  )
        {
            Id accountId = (Id) result.get('accId');
            Integer contactCount = (Integer) result.get('contactCounts');
            contactCountMap.put(accountId , contactCount);
        }
        
        // update the db using Bulkification
        List<Account> updateAccounts = new List<Account>();
        for( Id accountId : contactCountMap.keySet())
        {
            Account accountDetail = new Account();
            accountDetail.Id = accountId;
            accountDetail.Number_Of_Contacts__c = contactCountMap.get(accountId);

            updateAccounts.add(accountDetail);
        }

        update updateAccounts;
    }
}