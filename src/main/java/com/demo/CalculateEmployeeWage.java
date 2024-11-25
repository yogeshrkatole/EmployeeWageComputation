package com.demo;

public class CalculateEmployeeWage {

    private static final int Wage_Per_Hrs=20;
    private static final int Full_Day_Hrs=8;
    public void calculateEmployeeWage(int attendance) {
        int workingHrs=0;

        if(attendance==1){
            System.out.println("Employee is present");
            workingHrs=Full_Day_Hrs;
        }else{
            System.out.println("Employee is absent");
        }

        int dailyWage=workingHrs*Wage_Per_Hrs;
        System.out.println("Employee wage: "+dailyWage);
    }
}
