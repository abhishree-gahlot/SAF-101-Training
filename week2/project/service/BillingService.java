package week2.project.service;

import week2.project.model.*;
import week2.project.exception.PaymentFailedException;

public class BillingService 
{
	int maxBills = 10;
    private Billing[] bills = new Billing[maxBills];
    private int count = 0;

    public void generateBill(User user, Plan plan) {
        double amount = plan.getPrice();

        Billing bill = new Billing(count + 1, user.getUserId(), plan.getPlanId(), amount, "UNPAID");
        bills[count++] = bill;
        System.out.println("Bill generated for User ID: " + user.getUserId());
    }

    public void payBill(int billId) throws PaymentFailedException 
    {
        for (int index = 0; index < count; index++) 
        {
            if (bills[index].getBillId() == billId) 
            {
                if (bills[index].getStatus().equals("PAID")) 
                {
                    throw new PaymentFailedException("Bill already paid");
                }
                bills[index].setStatus("PAID");
                System.out.println("Payment successful");
                return;
            }
        }
        throw new PaymentFailedException("Bill not found");
    }
}