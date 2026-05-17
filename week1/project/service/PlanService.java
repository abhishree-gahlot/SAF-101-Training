package week1.project.service;

import week1.project.model.Plan;

public class PlanService {
	private final int maxPlans = 10;
    private int planCount = 0;
    private Plan[] planList = new Plan[maxPlans];

    public void addPlan(Plan newPlan) 
    {
        if (planCount < maxPlans) 
        {
            planList[planCount] = newPlan;
            planCount++;
        } 
        else 
        {
            System.out.println("No space in array for plans");
        }
    }

    public void displayPlans() 
    {
        for (int index = 0; index < planCount; index++) 
        {
            System.out.println(planList[index]);
        }
    }
}
