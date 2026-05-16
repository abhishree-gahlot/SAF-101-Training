package week1.assignment.day1;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of plan NORMAL/PREMIUM : ");
		String plan = scanner.nextLine().toUpperCase();
		
		Users userPlan = Users.valueOf(plan);
		
		System.out.println("Enter purchase amount");
		double amount = scanner.nextDouble();
		double discount;
		double finalAmount;
		
		if( userPlan == Users.PREMIUM)
		{
			discount = amount * 20 / 100;
		}
		else
		{
			discount = amount * 5 / 100;
		}
		
		finalAmount = amount - discount;
		
		System.out.println("Original Amount : " + amount);
        System.out.println("Discount Amount : " + discount);
        System.out.println("Final Amount : " + finalAmount);

        scanner.close();
	}

}
