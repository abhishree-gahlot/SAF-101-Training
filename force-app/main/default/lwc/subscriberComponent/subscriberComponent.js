import { LightningElement, wire } from 'lwc';

import {
    subscribe,
    MessageContext
} from 'lightning/messageService';

import EMPLOYEE_CHANNEL
from '@salesforce/messageChannel/employeeMessageChannel__c';

export default class Subscriber extends LightningElement {

    employeeName = '';

    @wire(MessageContext)
    messageContext;

    connectedCallback() {
        this.subscribeChannel();
    }

    subscribeChannel() {

        subscribe(
            this.messageContext,
            EMPLOYEE_CHANNEL,
            (message) => {
                this.employeeName = message.employeeName;
            }
        );
    }
}