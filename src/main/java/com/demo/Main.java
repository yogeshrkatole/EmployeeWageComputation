package com.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
                int attendance=employeeAttendance.getAttendance();
             System.out.print("Daily wage " +calculateEmployeeWage.calculateEmployeeWage(attendance));

    }
}