import { LightningElement , api } from 'lwc';

export default class LightningDataService extends LightningElement {

    @api recordId;
    objectName = 'Case';
    fields = ['CaseNumber' , 'Priority' , 'Status' , 'Reason' , 'Type' ];
}