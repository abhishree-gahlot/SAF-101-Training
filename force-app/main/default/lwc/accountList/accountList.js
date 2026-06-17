import { LightningElement, wire } from 'lwc';
import getAccounts from '@salesforce/apex/AccountController.getAccounts';

export default class AccountList extends LightningElement {

    accounts;
    error;

    @wire(getAccounts)
    wiredAccounts({ data, error }) {

        if (data) {
            this.accounts = data;
        }

        if (error) {
            this.error = error;
        }
    }
}