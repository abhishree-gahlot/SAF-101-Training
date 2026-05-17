package week2.assignment.day3;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		int age = 15;
		try
		{
			if( age < 18)
			{
				throw new ArithmeticException("Age is less than 18 , Not eligible for vote");
			}
		}
		catch( ArithmeticException e)
		{
			 System.out.println("Exception handled: " + e);
		}
		System.out.println("Program continues normally...");
	}
}
