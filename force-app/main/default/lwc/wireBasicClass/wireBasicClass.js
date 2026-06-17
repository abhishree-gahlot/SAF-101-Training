import { LightningElement , wire } from 'lwc';
import myMethod from '@salesforce/apex/wireBasic.myMethod';

export default class WireBasicClass extends LightningElement {

    @wire (myMethod) myMethod;


}
