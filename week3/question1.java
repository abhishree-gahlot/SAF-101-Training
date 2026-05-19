//Write a program to take 5 student names as input and store them in a `HashSet`. Print only unique names and count duplicates.

package week3;
import java.util.*;

public class question1 {

	public static void main(String[] args) {
		HashSet<String> studentsName = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		int duplicateCount = 0 ;
		
		System.out.println("Enter name of 5  Students");
		
		for(int i = 0 ; i<5 ; i++)
		{
			String nameOfStudent = scanner.next();
			if( !studentsName.add(nameOfStudent)) // add() method returns false if duplicate exists 
			{
				duplicateCount++;
			}
		}
		
		System.out.println("Name of Students entered:");
		for( String name : studentsName)
		{
			System.out.println(name);
		}
		
		System.out.println("\nDuplicate Count: " + duplicateCount);
        scanner.close();
	}
}
