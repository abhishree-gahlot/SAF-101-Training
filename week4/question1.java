package week4;

public class question1 {

    public static void main(String[] args) {
    	
        question1 calculator = new question1();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.subtract(10, 5));
        System.out.println(calculator.multiply(4, 5));
        System.out.println(calculator.divide(20, 4));
    }

    public int add(int a, int b) 
    {
        return a + b;
    }

    public int subtract(int a, int b) 
    {
        return a - b;
    }

    public int multiply(int a, int b) 
    {
        return a * b;
    }

    public int divide(int a, int b) 
    {
        return a / b;
    }
}