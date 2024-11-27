
import java.util.Scanner;

import com.demo.CalculateEmployeeWage;
import com.demo.Company;
import com.demo.EmployeeAttendance;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation\n");
        Scanner scanner = new Scanner(System.in);
        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
        
        System.out.print("Enter no of companies: "); 
        int noOfCompanies = scanner.nextInt();

        for (int i = 1; i <= noOfCompanies; i++) {
            Company company = getCompanyInfo(scanner);
            calculateEmployeeWage.calculateMonthlyWage(employeeAttendance, company);
        }
        scanner.close();
    }
    public static Company getCompanyInfo(Scanner scanner) {  
        System.out.print("Enter company name: ");
        String name = scanner.next();
        System.out.print("Enter wage per hr: ");
        int wagePerHr = scanner.nextInt();
        System.out.print("Enter full-day hrs: ");
        int fullDayHrs = scanner.nextInt();
        System.out.print("Enter part-time hrs: ");
        int partTimeHrs = scanner.nextInt();
        System.out.print("Enter maximum working days in a month: ");
        int maxWorkingDays = scanner.nextInt();
        System.out.print("Enter maximum working hrs in a month: ");
        int maxWorkingHrs = scanner.nextInt();

        return new Company(name, wagePerHr, fullDayHrs, partTimeHrs, maxWorkingDays, maxWorkingHrs);
    }
}