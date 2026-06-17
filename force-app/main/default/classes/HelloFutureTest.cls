@isTest
private class HelloFutureTest {

    @isTest
    static void testSayHello() {
        Test.startTest();
        HelloFuture.sayHello('World');
        Test.stopTest();

        System.assert(true, 'Future method ran successfully');
    }

}