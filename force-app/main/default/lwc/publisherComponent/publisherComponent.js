import { LightningElement, wire } from 'lwc';

import {
    publish,
    MessageContext
} from 'lightning/messageService';

import EMPLOYEE_CHANNEL
from '@salesforce/messageChannel/employeeMessageChannel__c';

export default class Publisher extends LightningElement {

    @wire(MessageContext)
    messageContext;

    sendMessage() {

        const payload = {
            employeeName: 'Rahul Sharma'
        };

        publish(
            this.messageContext,
            EMPLOYEE_CHANNEL,
            payload
        );
    }
}