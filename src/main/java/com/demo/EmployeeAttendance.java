package com.demo;

import java.util.Random;

public class EmployeeAttendance {

    public void printAttendance() {
        Random random = new Random();
        int attendance = random.nextInt(2);
         if (attendance == 0) {
             System.out.println("Employee is absent");
         }else {
             System.out.println("Employee is present");
         }
    }
}
