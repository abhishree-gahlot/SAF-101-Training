//Create two `Set`s:
//
//   * Customers who ordered Pizza
//   * Customers who ordered Burger
//     Find common customers and customers who ordered only Pizza.

package week3;
import java.util.*;

public class question2 {

	public static void main(String[] args) {
		HashSet<String> pizzaCustomer = new HashSet<>();
		HashSet<String> burgerCustomer = new HashSet<>();
		pizzaCustomer.add("Rahul");
	    pizzaCustomer.add("Aman");
	    pizzaCustomer.add("Neha");
	    pizzaCustomer.add("Simran");

	    burgerCustomer.add("Aman");
	    burgerCustomer.add("Neha");
	    burgerCustomer.add("Rohit");
	    
	    HashSet<String> commonCustomers = new HashSet<>(pizzaCustomer);
	    commonCustomers.retainAll(burgerCustomer); //retainAll() keeps only those elements that are present in both sets
	    
	    System.out.println("Name of Common Customers");
	    for( String name : commonCustomers)
	    {
	    	System.out.println(name);
	    }
	    
	    HashSet<String> onlyPizzaCustomers = new HashSet<>(pizzaCustomer);
	    onlyPizzaCustomers.removeAll(burgerCustomer);
	    
	    System.out.println("-------------------------------"
	    		+ "Name of only Pizza Customers");
	    for( String name : onlyPizzaCustomers)
	    {
	    	System.out.println(name);
	    }
	}

}
