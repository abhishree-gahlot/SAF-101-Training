//Write a program to search for a product name in a sorted list using `Collections.binarySearch()`
package week3;

import java.util.*;

public class question5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		 numbers.add(50);
	     numbers.add(10);
	     numbers.add(30);
	     numbers.add(20);
	     
	     Collections.sort(numbers);
	     System.out.println(numbers);
	     
	     int index = Collections.binarySearch(numbers, 30);
	     //returns index of element if found else negative value if not found
	     System.out.println("Element found at index: " + index); 
	    
	}

}
