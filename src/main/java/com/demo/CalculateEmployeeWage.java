package com.demo;

public class CalculateEmployeeWage {

    private static final int Wage_Per_Hrs=20;
    private static final int Full_Day_Hrs=8;
    private static final int Part_Time_Hrs=8;
    public int calculateEmployeeWage(int attendance) {
        int workingHrs=0;

        switch(attendance){
            case 0:
                System.out.println("Employee is absent");
                break;
            case 1:
                   System.out.println("Employee is present");
                   workingHrs=Full_Day_Hrs;
                   break;
            case 2:
                   System.out.println("Employee doing part time ");
                   workingHrs=Part_Time_Hrs;
                   break;
        }

        return workingHrs*Wage_Per_Hrs;

    }
}
