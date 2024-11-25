package com.demo;

public class CalculateEmployeeWage {

    private static final int Wage_Per_Hrs=20;
    private static final int Full_Day_Hrs=8;
    private static final int Part_Time_Hrs=8;
    public int calculateEmployeeWage(int attendance) {
        int workingHrs=0;

        if(attendance==1){
            System.out.println("Employee is present");
            workingHrs=Full_Day_Hrs;
        }else if(attendance==2){
            System.out.println("Employee doing part time ");
            workingHrs=Part_Time_Hrs;
        }else{
            System.out.println("Employee is absent");
        }

        return workingHrs*Wage_Per_Hrs;

    }
}
