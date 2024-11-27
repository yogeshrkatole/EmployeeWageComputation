package com.demo;

public class CalculateEmployeeWage {
    
    public int calculateEmployeeWage(int attendance,Company company) {
        int workingHrs=getWorkingHrs(attendance,company);
        return workingHrs*company.getWagePerHr();
    }
    
    public int getWorkingHrs(int attendance,Company company){
        switch(attendance){
            case 1:
                return company.getFullDayHr();
            case 2:
            	return company.getPartTimehrs();
            default:
                return 0;
        }
    }
     public void calculateMonthlyWage(EmployeeAttendance employeeAttendance,Company company) {
    	 int monthlyWage=0;
    	    int monthlyWorkingHrs=0;
    	    int monthlyWorkingDays=0;
    	    System.out.println("Calculate wages for "+company.getName());
    	 while(monthlyWorkingDays<company.getMaxWorkDays()&&monthlyWorkingHrs<company.getMaxWorkHrs()) {
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
             int dailyWage=calculateEmployeeWage(attendance,company);
             int dailyHrs=getWorkingHrs(attendance,company);
             if (monthlyWorkingHrs + dailyHrs > company.getMaxWorkHrs()) { 
                 System.out.println("Break due to reach max hours "+company.getMaxWorkHrs()); 
                 break;
             } else if(monthlyWorkingDays==company.getMaxWorkDays()){
            	 System.out.println("Break due to reach max days "+company.getMaxWorkDays());
            	 break;
               }
             else {
                 monthlyWorkingHrs += dailyHrs;
                 monthlyWage += dailyWage;
                 System.out.println("Daily Wage: " + dailyWage);
             }
             System.out.println("Total Hours Worked: " + monthlyWorkingHrs);
         }
    	 System.out.println("\nMonthly Wage");
    	 System.out.println("Total Wage "+monthlyWage);
         System.out.println("Total Working Days "+monthlyWorkingDays);
         System.out.println("Total Working Hrs "+monthlyWorkingHrs);
         System.out.println();
     }
    }
