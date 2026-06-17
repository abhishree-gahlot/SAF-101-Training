public class HelloFuture {

    @future
    public static void sayHello(String name) {
        System.debug('Hello from the future, ' + name + '!');
    }

}