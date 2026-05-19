// Store website URLs in a `LinkedHashSet` and display them in the same order they were added.
package week3;
import java.util.*;

public class question3 {

	public static void main(String[] args) {
		LinkedHashSet<String> urlStorage = new LinkedHashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the urls of website");
		 while (urlStorage.size() < 5) {

	            String url = scanner.next();

	            if (!urlStorage.add(url)) {
	                System.out.println("Duplicate URL. Enter another URL.");
	            }
	     }

        System.out.println("Stored URLs in insertion order:");

        for (String url : urlStorage) {
            System.out.println(url);
        }

        scanner.close();
	}

}
