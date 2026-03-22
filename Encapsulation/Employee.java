package com.gla.Encapsulation;

interface Department {
    void assignDepartment(String deptName);
    void getDepartmentDetails();
}

abstract class Employee {

    int employeeId;
    String name;
    double baseSalary;

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee implements Department {

    double fixedSalary;
    String dept;

    FullTimeEmployee(int id, String name, double baseSalary, double fixedSalary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.fixedSalary = fixedSalary;
    }

    double calculateSalary() {
        return fixedSalary;
    }

    public void assignDepartment(String deptName) {
        dept = deptName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

class PartTimeEmployee extends Employee implements Department {

    int hoursWorked;
    double ratePerHour;
    String dept;

    PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked, double ratePerHour) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    public void assignDepartment(String deptName) {
        dept = deptName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + dept);
    }
}

    class Main {
    public static void main(String[] args) {

        Employee[] emp = new Employee[2];

        FullTimeEmployee f = new FullTimeEmployee(1, "Aman", 10000, 50000);
        f.assignDepartment("IT");

        PartTimeEmployee p = new PartTimeEmployee(2, "Ravi", 5000, 5, 200);
        p.assignDepartment("HR");

        emp[0] = f;
        emp[1] = p;

        for (int i = 0; i < emp.length; i++) {
            emp[i].displayDetails();
            System.out.println("Salary: " + emp[i].calculateSalary());
            Department d = (Department) emp[i];
            d.getDepartmentDetails();

            System.out.println("----------------------");
        }
    }
}