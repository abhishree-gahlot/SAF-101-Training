//Store employee salaries in an `ArrayList` and sort them in ascending and descending order.
package week3;
import java.util.*;


public class question4 {

	public static void main(String[] args) {
		ArrayList<Double> salary = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter salary of employee");
		for(int i=0 ; i<5 ; i++)
		{
			Double amount = scanner.nextDouble();
			salary.add(amount);
		}
		
		Collections.sort(salary);
		System.out.println("Ascending order list : ");
		for( Double amount : salary)
		{
			System.out.println(amount);
		}
		
		Collections.reverse(salary);
		System.out.println("Descending order list : ");
		for( Double amount : salary)
		{
			System.out.println(amount);
		}
	}

}
