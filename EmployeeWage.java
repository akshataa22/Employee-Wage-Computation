package com.day8;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int partTimeHour = 4;
        final int workingDays = 20;
        int totalWage = 0;
        for (int day = 0; day < workingDays; day++) {
            int empCheck = new Random().nextInt(3); // using random function to generate 0, 1, or 2

            int dailyWage = 0;
        switch (empCheck) {
            case 0:
                System.out.println("Day " + (day + 1) + ": Employee is Absent.");
                break;
            case 1:
                System.out.println("Day " + (day + 1) + ": Employee is Present (Full Time).");
                dailyWage = wagePerHour * fullDayHour;
                break;
            case 2:
                System.out.println("Day " + (day + 1) + ": Employee is Present (Part Time).");
                dailyWage = wagePerHour * partTimeHour;
                break;
        }

        totalWage += dailyWage;
        System.out.println("Daily Wage: " + dailyWage);
    }
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
