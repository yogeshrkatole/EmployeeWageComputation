package com.demo;

public class CalculateEmployeeWage {

    private static final int Wage_Per_Hrs=20;
    private static final int Full_Day_Hrs=8;
    private static final int Part_Time_Hrs=8;
    private static final int Max_Working_Days=20;
    private static final int Max_Working_Hrs=100;
    
    int monthlyWage=0;
    int monthlyWorkingHrs=0;
    int monthlyWorkingDays=0;
    
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
     public void calculateMonthlyWage(EmployeeAttendance employeeAttendance) {
    	 while(monthlyWorkingDays<Max_Working_Days&&monthlyWorkingHrs<Max_Working_Hrs) {
             int attendance = employeeAttendance.getAttendance();
             switch(attendance){
             case 1:
                 System.out.println("\nEmployee is present");
                 monthlyWorkingDays++;
                 break;
             case 2:
                 System.out.println("\nEmployee doing part time ");
                 break;
             default:
                 System.out.println("\nEmployee is absent");
                 break;
         }
             int dailyWage=calculateEmployeeWage(attendance);
             int dailyHrs=getWorkingHrs(attendance);
             if (monthlyWorkingHrs + dailyHrs > Max_Working_Hrs) { 
                 int requiredHrs = Max_Working_Hrs - monthlyWorkingHrs; 
                 monthlyWorkingHrs += requiredHrs;
                 monthlyWage += requiredHrs * (Wage_Per_Hrs );
                 System.out.println("Last Day Wage: " + requiredHrs * (Wage_Per_Hrs ));
                 System.out.println("Total Hours Worked: " + monthlyWorkingHrs);
                 System.out.println("Add " + requiredHrs + "  hours to reach max hours.\n"); 
                 break;
             } else {
                 monthlyWorkingHrs += dailyHrs;
                 monthlyWage += dailyWage;
                 System.out.println("Daily Wage: " + dailyWage);
                 System.out.println("Total Hours Worked: " + monthlyWorkingHrs);
             }
             
         }
    	 System.out.println("Monthly Wage");
    	 System.out.println("Total Wage "+monthlyWage);
         System.out.println("Total Working Days "+monthlyWorkingDays);
         System.out.println("Total Working Hrs "+monthlyWorkingHrs);
     }
    }
