package week1.assignment.day1;
 
import java.util.Scanner;
 
public class ReverseArray {
 
	public static void main(String[] args) {
		
		int size = 10;
		int[] inputArray = new int[size];
		int[] reversedArray = new int[size];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter input digit : ");
		for( int index = 0; index < size ; index++)
		{
			inputArray[index] = scanner.nextInt();
		}
		
		int reverseIndex = size-1;
		for(int index = 0 ; index < size; index++ )
		{
			reversedArray[reverseIndex] = inputArray[index];
			reverseIndex--;
		}
		
		System.out.println("Reversed Array : ");
		for( int index = 0; index < size ; index++)
		{
			System.out.println("Element " + index + " : " + reversedArray[index]);
		}
		
		scanner.close();
	}
 
}
 