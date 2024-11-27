
import com.demo.CalculateEmployeeWage;
import com.demo.EmployeeAttendance;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeAttendance employeeAttendance = new EmployeeAttendance();
        CalculateEmployeeWage calculateEmployeeWage = new CalculateEmployeeWage();
        calculateEmployeeWage.calculateMonthlyWage(employeeAttendance); 

    }
}