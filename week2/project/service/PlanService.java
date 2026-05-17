package week2.project.service;

import week2.project.model.Plan;
import week2.project.exception.InvalidPlanException;

public class PlanService {
	int maxPlans = 10;
    private Plan[] plans = new Plan[maxPlans];
    private int count = 0;

    public void addPlan(Plan plan) 
    {
        plans[count++] = plan;
        System.out.println("Plan added successfully");
    }

    public Plan getPlanById(int planId) throws InvalidPlanException 
    {
        for (int index = 0; index < count; index++) 
        {
            if (plans[index].getPlanId() == planId) 
            {
                return plans[index];
            }
        }
        throw new InvalidPlanException("Plan with ID " + planId + " not found");
    }
}