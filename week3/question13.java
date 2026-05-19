//13. Create a phonebook application using `HashMap` where:
// Name → Phone Number

package week3;
import java.util.*;

public class question13 {

	public static void main(String[] args) {
		HashMap<String , String> phonebook = new HashMap<>();
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter the details for phonebook application :");
		for( int i=0 ; i<5;  i++)
		{
			String key = scanner.next();
			String value = scanner.next();
			
			phonebook.put(key, value);
		}
		
		System.out.println("The details contains : ");
		System.out.println(phonebook);
	}

}
