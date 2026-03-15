package com.company.main;

import com.company.hr.Employee;      
import com.company.payroll.*;

public class MainApp {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Himanshu", "IT", 50000);

        Payroll payroll = new Payroll();

        double newSalary = payroll.calculateBonus(emp);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Original Salary: " + emp.getSalary());
        System.out.println("Salary After Bonus: " + newSalary);
    }
}
