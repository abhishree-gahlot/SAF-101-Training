package week1.project.model;

import week1.project.enums.EmployeeCategory;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private EmployeeCategory employeeCategory;
	
	public Employee(int employeeId, String employeeName, double salary, EmployeeCategory employeeCategory) {
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
		this.setSalary(salary);
		this.setEmployeeCategory(employeeCategory);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeCategory getEmployeeCategory() {
		return employeeCategory;
	}

	public void setEmployeeCategory(EmployeeCategory employeeCategory) {
		this.employeeCategory = employeeCategory;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", employeeCategory=" + employeeCategory + "]";
	}
	
}
