import { LightningElement, api } from 'lwc';

export default class ChildComponent extends LightningElement {
    @api message;

    handleClick()
    {
        const event = new CustomEvent( 'eventname' , 
            {
                detail : data
            }
        );

        this.dispatchEvent(event);
    }
}