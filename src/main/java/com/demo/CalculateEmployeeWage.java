package com.demo;

public class CalculateEmployeeWage {

    private static final int Wage_Per_Hrs=20;
    private static final int Full_Day_Hrs=8;
    private static final int Part_Time_Hrs=8;
    public int calculateEmployeeWage(int attendance) {
        int workingHrs=getWorkingHrs(attendance);
        return workingHrs*Wage_Per_Hrs;
    }
    public int getWorkingHrs(int attendance){
        switch(attendance){
            case 1:
                return Full_Day_Hrs;
            case 2:
            	return Part_Time_Hrs;
            default:
                return 0;
        }
    }
}
