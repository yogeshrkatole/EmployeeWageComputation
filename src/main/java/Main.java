
import com.demo.CalculateEmployeeWage;
import com.demo.EmployeeAttendance;

public class Main {
    private static final int Max_Working_Days=20;
    private static final int Max_Working_Hrs=100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
        int monthlyWage=0;
        int monthlyWorkingHrs=0;
        int monthlyWorkingDays=0;
        while(monthlyWorkingDays<Max_Working_Days&&monthlyWorkingHrs<Max_Working_Hrs) {
            int attendance = employeeAttendance.getAttendance();
            switch(attendance){
            case 1:
                System.out.println("\nEmployee is present");
                break;
            case 2:
                System.out.println("\nEmployee doing part time ");
                break;
            default:
                System.out.println("\nEmployee is absent");
                break;
        }
            int dailyWage=calculateEmployeeWage.calculateEmployeeWage(attendance);
            int dailyHrs=calculateEmployeeWage.getWorkingHrs(attendance);
            monthlyWorkingHrs+=dailyHrs;
            System.out.println("Daily wage " + dailyWage);
            System.out.println("Total Hrs Worked " + monthlyWorkingHrs);
            monthlyWage+=dailyWage;
            if(monthlyWorkingHrs>=Max_Working_Hrs) {
                System.out.println("\nReached Max Working Hrs For Month \n");
                break;
            }
        }
        System.out.println("Total Wage "+monthlyWage);
        System.out.println("Total Working Days "+monthlyWorkingDays);
        System.out.println("Total Working Hrs "+monthlyWorkingHrs);

    }
}