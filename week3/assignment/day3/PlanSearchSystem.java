package week3.assignment.day3;

import java.util.*;
import java.util.TreeSet;

class InternetPlan {
	
    int price;

    public InternetPlan(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plan Price = " + price;
    }
}


public class PlanSearchSystem {

	public static void main(String[] args) {

		Set<Integer> plans = new TreeSet<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the plan prices");
		for(int index =0 ; index<3 ; index++)
		{
			int plan = scanner.nextInt();
			plans.add(plan);
		}
	
		System.out.println("Enter the customer prices");
		int customerPrice = scanner.nextInt();

        System.out.println("Customer Budget: " + customerPrice);

        System.out.println("\nMatching Plans:");

        for (int plan : plans) {
            if (plan <= customerPrice + 100 &&
                plan >= customerPrice - 100) {

                System.out.println(plan);
            }
        }
    }
}