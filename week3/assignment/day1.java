package week3.assignment;

import java.util.*;

public class day1 {

	public static void main(String[] args) {
		Set<String> planList = new HashSet<>();
		
		planList.add("Basic Plan");
		planList.add("Premium Plan");
		planList.add("Family Plan");
		planList.add("Student Plan");
		
	
		System.out.println("Demonstrating all the  set functions");
		
		Set<String> planData = new HashSet<>();
		planData.add("Demo Data 1");
		
		planList.addAll(planData);
		System.out.println("Updated set after addAll\n" + planList);
		
		planList.remove("Demo Data 1");
		System.out.println("Updated set after remove\n" + planList);
		
		planData.add("Student Plan");
		planData.add("Family Plan");
		
		planList.retainAll(planData);
		System.out.println("Updated set after remove\n" + planList);
		
		System.out.println("Contains all planData elements? " + planList.containsAll(planData));
		System.out.println("Is both set equal? " + planList.equals(planData));
		
	}

}
