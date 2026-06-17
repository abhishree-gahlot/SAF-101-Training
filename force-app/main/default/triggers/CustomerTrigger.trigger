trigger CustomerTrigger on Customer__c (before insert, before update) {

    Set<Id> planIds = new Set<Id>();

    for(Customer__c cust : Trigger.new){

        if(Trigger.isInsert && cust.Selected_Plan__c != null){
            planIds.add(cust.Selected_Plan__c);
        }

        if(Trigger.isUpdate &&
           cust.Selected_Plan__c != null &&
           cust.Selected_Plan__c != Trigger.oldMap.get(cust.Id).Selected_Plan__c){

            planIds.add(cust.Selected_Plan__c);
        }
    }

    if(planIds.isEmpty()){
        return;
    }

    Map<Id, Internet_Plan_Object__c> planMap =
        new Map<Id, Internet_Plan_Object__c>(
            [SELECT Id, Monthly_Price__c
             FROM Internet_Plan_Object__c
             WHERE Id IN :planIds]
        );

    for(Customer__c cust : Trigger.new){

        if(cust.Selected_Plan__c != null &&
           planMap.containsKey(cust.Selected_Plan__c)){

            cust.Monthly_Bill__c =
                planMap.get(cust.Selected_Plan__c).Monthly_Price__c;
        }
    }
}