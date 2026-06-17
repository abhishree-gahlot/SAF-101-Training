trigger PracticeTrigger on Account ( after insert)
{
    List<Contact> contactsToInsert = new List<Contact>();

    for( Account acc : Trigger.new)
    {
        contactsToInsert.add(
            new Contact(
                LastName = 'Primary Contact',
                AccountId = acc.Id
            )
        );
    }

    insert contactsToInsert;
}

