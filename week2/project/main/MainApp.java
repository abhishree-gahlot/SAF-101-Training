package week2.project.main;

import week2.project.model.*;
import week2.project.service.*;
import week2.project.exception.*;

public class MainApp {

    public static void main(String[] args) 
    {
        UserService userService = new UserService();
        PlanService planService = new PlanService();
        BillingService billingService = new BillingService();

        userService.addUser(new User(1, "Amit", "amit@gmail.com", "9876543210", true));
        userService.addUser(new User(2, "Rahul", "rahul@gmail.com", "9876543211", true));

        planService.addPlan(new Plan(101, "Basic", 50, 100, 499));
        planService.addPlan(new Plan(102, "Premium", 100, 500, 999));

        try {
            User user = userService.getUserById(1);
            Plan plan = planService.getPlanById(101);

            billingService.generateBill(user, plan);
            billingService.payBill(1);
            userService.getUserById(999); 
        } 
        catch (UserNotFoundException e) {
            System.out.println("Handled User Exception: " + e);
        } 
        catch (InvalidPlanException e) {
            System.out.println("Handled Plan Exception: " + e);
        } 
        catch (PaymentFailedException e) {
            System.out.println("Handled Payment Exception: " + e);
        } 
        finally {
            System.out.println("System execution completed");
        }
    }
}