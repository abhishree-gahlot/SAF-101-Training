@isTest
private class AccountProcessorTest {

    @isTest
    static void testCountContacts() {

        // Create Accounts
        Account acc1 = new Account(Name = 'Account 1');
        Account acc2 = new Account(Name = 'Account 2');

        insert new List<Account>{acc1, acc2};

        // Create Contacts
        List<Contact> contacts = new List<Contact>{
            new Contact(
                LastName = 'Contact 1',
                AccountId = acc1.Id
            ),
            new Contact(
                LastName = 'Contact 2',
                AccountId = acc1.Id
            ),
            new Contact(
                LastName = 'Contact 3',
                AccountId = acc2.Id
            )
        };

        insert contacts;

        Test.startTest();

        AccountProcessor.countContacts(
            new List<Id>{acc1.Id, acc2.Id}
        );

        Test.stopTest();

        // Verify results
        Map<Id, Account> accountsMap = new Map<Id, Account>(
            [
                SELECT Id,
                       Number_Of_Contacts__c
                FROM Account
                WHERE Id IN :new List<Id>{acc1.Id, acc2.Id}
            ]
        );

        System.assertEquals(
            2,
            accountsMap.get(acc1.Id).Number_Of_Contacts__c,
            'Account 1 should have 2 contacts'
        );

        System.assertEquals(
            1,
            accountsMap.get(acc2.Id).Number_Of_Contacts__c,
            'Account 2 should have 1 contact'
        );
    }
}