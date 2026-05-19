	//Convert an integer array into an `ArrayList`, remove duplicate elements using `Set`, and print the updated list.

package week3;
import java.util.*;

public class question7 {

	public static void main(String[] args) {
		Integer[] number = { 23 , 45 , 67 , 89 , 10 , 10 , 10 };

		List<Integer> list = Arrays.asList(number);
		System.out.println(list);
		
		Set<Integer> set =  new LinkedHashSet<>(list); // lhs because it maintains order
		List<Integer> updatedList = new ArrayList<>(set);
		System.out.println(" Updated List: ");
	    System.out.println(updatedList);
		
	}
}
