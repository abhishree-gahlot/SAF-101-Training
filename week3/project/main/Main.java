package week3.project.main;

import week3.project.model.InternetPlan;
import week3.project.service.PlanService;

public class Main 
{
    public static void main(String[] args) 
    {
        PlanService service = new PlanService();

        service.addPlan(new InternetPlan(1, "Basic Plan", 299, 20, 28, "4G"));
        service.addPlan(new InternetPlan(2, "Premium Plan", 599, 100,  56, "5G"));
        service.addPlan(new InternetPlan(3, "Starter Plan", 199, 10, 14, "2G"));
        service.addPlan(new InternetPlan(4 , "Ultra Plan", 799, 200 ,  84, "5G"));

        System.out.println("All plans");
        service.displayPlan();

        System.out.println("Plans below 500");
        service.searchByPrice(500);

        System.out.println("Plans with speed >= 50");
        service.searchBySpeed(50);

        System.out.println("Plans with validity >= 30");
        service.searchByValidity(30);

        service.sortByPrice();
        service.sortBySpeed();
        service.sortByNetworkType();
    }
}