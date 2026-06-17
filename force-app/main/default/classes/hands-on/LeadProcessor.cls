public with sharing class LeadProcessor implements Database.Batchable<sObject> 
                                            , Database.Stateful
{
    public Database.QueryLocator start ( Database.BatchableContext context)
    {
        return Database.getQueryLocator(
            'Select Id , LeadSource from Lead'
        );
    }

    public void execute ( Database.BatchableContext context , List<Lead> scope )
    {
        for(Lead leadRecord : scope)
        {
            leadRecord.LeadSource = 'Dreamforce';
        }

        update scope;
    }

    public void finish ( Database.BatchableContext context )
    {

    }
}




//to execute a batch  default 200 max 2000
//    LeadProcessor batchJob = new LeadProcessor();
//     Database.executeBatch(batchJob , 10);