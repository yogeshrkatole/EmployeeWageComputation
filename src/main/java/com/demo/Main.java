package com.demo;

public class Main {
    private static final int Working_Days_Per_Month=20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
        int monthlyWage=0;
        for(int day=1;day<=Working_Days_Per_Month;day++) {
            int attendance = employeeAttendance.getAttendance();
            int dailyWage=calculateEmployeeWage.calculateEmployeeWage(attendance);
            monthlyWage+=dailyWage;
            System.out.println("Daily wage " +dailyWage);
        }
        System.out.println("Total wage "+monthlyWage);

    }
}