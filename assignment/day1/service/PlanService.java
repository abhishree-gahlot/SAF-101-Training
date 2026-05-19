package week3.project.service;

import java.util.*;
import week3.project.model.InternetPlan;

public class PlanService 
{
	private ArrayList<InternetPlan> plans = new ArrayList<>();
	
	public void addPlan(InternetPlan plan) 
	{
		 plans.add(plan);
	}
	
	public void displayPlan()
	{
		for(InternetPlan plan : plans)
		{
			System.out.println(plan);
		}
	}
	
	public void searchByPrice(double maxPrice) 
	{
		for (InternetPlan plan : plans) 
		{
            if (plan.getPrice() <= maxPrice) 
            {
                System.out.println(plan);
            }
        }
	}
	
	public void searchBySpeed(int minSpeed) 
	{
		for (InternetPlan plan : plans) 
		{
			if (plan.getSpeed() >= minSpeed) 
			{
                System.out.println(plan);
            }
        }
    }
	
	public void searchByValidity(int minValidity) 
	{
        for (InternetPlan plan : plans)
        {
            if (plan.getValidity() >= minValidity) 
            {
                System.out.println(plan);
            }
        }
    }
	
	public void sortByPrice() 
	{
		Collections.sort(plans, Comparator.comparingDouble(InternetPlan::getPrice));
	    System.out.println("Sorted By Price:");
	    displayPlan();
	}
	
	public void sortBySpeed() 
	{
		Collections.sort(plans, Comparator.comparingInt(InternetPlan::getSpeed));
		System.out.println("Sorted By Speed:");
        displayPlan();
    }

    public void sortByNetworkType() 
    {
    	Collections.sort(plans, Comparator.comparing(InternetPlan::getNetworkType));
    	System.out.println("Sorted By Network Type:");
        displayPlan();
    }
    
    public ArrayList<InternetPlan> getPlans()
    {
        return plans;
    }
}
