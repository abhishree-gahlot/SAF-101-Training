import { LightningElement } from 'lwc';

export default class ParentComponent extends LightningElement {
    parentMessage = 'Hello Child! This message comes from Parent.';

    handleEvent(event) {
        const data = event.detail;
    }
}