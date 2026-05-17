package week2.assignment.day2;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try
		{
			int c = a / b ;
			System.out.println("C value : " +  c);
		}
		catch ( ArithmeticException e )
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Code Execution Succesfully");
		}
	}	
}
