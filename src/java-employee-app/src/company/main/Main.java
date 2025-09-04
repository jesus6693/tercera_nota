package company.main;

import company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setRole("Developer");
        employee1.setSalary(50000);

        Employee employee2 = new Employee();
        employee2.setName("Bob");
        employee2.setRole("Manager");
        employee2.setSalary(70000);

        System.out.println("Employee 1: " + employee1.getName() + ", Role: " + employee1.getRole() + ", Salary: " + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getName() + ", Role: " + employee2.getRole() + ", Salary: " + employee2.getSalary());

        employee1.increaseSalary(5000);
        employee2.increaseSalary(3000);

        System.out.println("After salary increase:");
        System.out.println("Employee 1: " + employee1.getName() + ", Salary: " + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getName() + ", Salary: " + employee2.getSalary());
    }
}