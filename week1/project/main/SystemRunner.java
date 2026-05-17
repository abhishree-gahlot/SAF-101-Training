package week1.project.main;

import week1.project.service.*;
import week1.project.enums.EmployeeCategory;
import week1.project.model.*;

public class SystemRunner {

    public static void main(String[] args) {

        PlanService planService = new PlanService();
        EmployeeService employeeService = new EmployeeService();
        UserService userService = new UserService();

        Plan basicPlan = new Plan(1, "Basic", 199, 30);
        Plan premiumPlan = new Plan(2, "Premium", 499, 90);

        planService.addPlan(basicPlan);
        planService.addPlan(premiumPlan);

        Employee employee1 = new Employee(101, "Amit", 30000, EmployeeCategory.DEVELOPER);
        Employee employee2 = new Employee(102, "Ravi", 25000, EmployeeCategory.TESTER);

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);

        User user1 = new User(1, "Rahul", "rahul@gmail.com", "9876543210", basicPlan);
        User user2 = new User(2, "Sneha", "sneha@gmail.com", "9123456780", premiumPlan);

        userService.addUser(user1);
        userService.addUser(user2);

        System.out.println("===== PLANS =====");
        planService.displayPlans();

        System.out.println("\n===== EMPLOYEES =====");
        employeeService.displayEmployees();

        System.out.println("\n===== USERS =====");
        userService.displayUsers(); 
    }
}