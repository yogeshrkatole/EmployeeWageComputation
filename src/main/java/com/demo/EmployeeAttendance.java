package com.demo;

import java.util.Random;

public class EmployeeAttendance {

    public int getAttendance() {
        Random random = new Random();
        return random.nextInt(2);

    }
}
