package com.day8;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int workingDays = 20;
        int totalWage = 0;
        for (int day = 0; day < workingDays; day++) {
            int empCheck = new Random().nextInt(2); // using random function to generate 0 and 1
            if (empCheck == 1) {
                System.out.println("Day " + (day + 1) + ": Employee is Present.");
                int dailyWage = wagePerHour * fullDayHour;
                totalWage += dailyWage;
            } else {
                System.out.println("Day " + (day + 1) + ": Employee is absent.");
            }
        }
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
