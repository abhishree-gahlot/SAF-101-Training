package week1.project.service;

import week1.project.model.Employee;

public class EmployeeService {
	private final int maxEmployees = 10;
	private int employeeCount = 0;
	private Employee[] employeeList = new Employee[maxEmployees];
	
	public void addEmployee(Employee newEmployee)
	{
		if(employeeCount < maxEmployees)
		{
			employeeList[employeeCount] = newEmployee;
			employeeCount++;
		}
		else
		{
			System.out.println("No space in array");
		}
	}
	
	public void displayEmployees()
	{
		for(int index=0 ; index<employeeCount ; index++)
		{
			System.out.println(employeeList[index]);
		}
	}
}
