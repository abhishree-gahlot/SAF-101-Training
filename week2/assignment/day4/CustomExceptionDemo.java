package week2.assignment.day4;

public class CustomExceptionDemo {

	public static void main(String[] args) 
	{
		 int age = 16;

	        try 
	        {
	            validateAge(age);
	            System.out.println("User is eligible for registration.");

	        } 
	        catch (InvalidAgeException e) 
	        {
	            System.out.println("Custom Exception Handled: " + e);
	        }

	        System.out.println("Program execution succesful...");
	}
	
	static void validateAge(int age) throws InvalidAgeException 
	{
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
    }
}
