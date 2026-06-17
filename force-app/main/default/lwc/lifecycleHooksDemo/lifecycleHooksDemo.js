import { LightningElement , track } from 'lwc';

export default class LifecycleHooksDemo extends LightningElement {

    @track greeting  = 'Hello';

    //1. constructor
    constructor()
    {
        super(); //always calls 
        console.log("Constructor : Component created ");
    }

    //2. connectedCallback
    connectedCallback()
    {
        console.log("ConnectedCallback : Component inserted on the DOM");
    }

    //3. renderedCallback initial + rerenders after every render
    renderedCallback() 
    {
        console.log('renderedCallback', 'DOM is ready');
    }

    //4. disconnectedCallback
    disconnectedCallback() 
    {
        console.log('disconnectedCallback', 'Removed from page');
    }

    // 5. Child component throws an error
    errorCallback(error, stack) 
    {
        console.log('errorCallback', error.message);
    }
}