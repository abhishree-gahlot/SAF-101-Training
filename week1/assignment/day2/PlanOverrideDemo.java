package week1.assignment.day2;

public class PlanOverrideDemo {

	public static void main(String[] args) {
		Plan normalUser = new Plan(600);
		normalUser.showBenefits();
		
		System.out.println();
		
        //Runtime Polymorphism : Upcasting 
		Plan primeUser = new PrimePlan(999);
		primeUser.showBenefits();
		
		System.out.println();
		
		PrimePlan primeUser1 = new PrimePlan(532);
		primeUser1.showBenefits();
		
		// Compile Time Polymorphism : Method overloading
		normalUser.showDiscount(1000);

		System.out.println();

		normalUser.showDiscount(1000, 100);
	}

}

class Plan
{
	int amount;
	Plan(int amount)
	{
		this.amount = amount;
	}
	
	void showBenefits()
	{
		System.out.println("Normal Plan");
		System.out.println("Subscription Amount : " + amount);
		System.out.println("5% Discount");
	}
	
	void showDiscount(int amount)
	{
		int finalAmount = amount - (amount * 5 / 100);
		System.out.println("Normal Discount Applied");
		System.out.println("Original Amount : " + amount);
		System.out.println("Final Amount : " + finalAmount);
	}
	
	void showDiscount(int amount , int coupon)
	{
		int discountAmount = amount * 10 / 100;
		int finalAmount = amount - discountAmount - coupon;

		System.out.println("Discount + Coupon Applied");
		System.out.println("Original Amount : " + amount);
		System.out.println("Coupon Value : " + coupon);
		System.out.println("Final Amount : " + finalAmount);
	}
}

class PrimePlan extends Plan
{
	PrimePlan(int amount)
	{
		super(amount);
	}
	
	@Override
	void showBenefits()
	{
		System.out.println("Premium Plans Benefits");
		System.out.println("Subscription Amount : " + amount);
		System.out.println("20% Discount");
		System.out.println("Free Delivery");
		System.out.println("Priority Customer Support");
	}
}