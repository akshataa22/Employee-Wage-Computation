package com.day8;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        final int wagePerHour = 20;
        final int fullDayHour = 8;
        final int partTimeHour = 4;
        final int maxWorkingDays = 20;
        final int maxWorkingHours = 100;

        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;
        while (totalDaysWorked < maxWorkingDays && totalHoursWorked < maxWorkingHours) {
            int empCheck = new Random().nextInt(3); // using random function to generate 0, 1, or 2

            int dailyWage = 0;
            int dailyHoursWorked = 0;
        switch (empCheck) {
            case 0:
                System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is Absent.");
                break;
            case 1:
                System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is Present Full Day.");
                dailyHoursWorked = fullDayHour;
                break;
            case 2:
                System.out.println("Day " + (totalDaysWorked + 1) + ": Employee is Present Half Day.");
                dailyHoursWorked = partTimeHour;
                break;
        }

        totalDaysWorked++;
        totalHoursWorked += dailyHoursWorked;
        dailyWage = wagePerHour * dailyHoursWorked;
        totalWage += dailyWage;
        System.out.println("Daily Wage: " + dailyWage);
    }
        System.out.println("Total Wages for a month: " + totalWage);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Days Worked: " + totalDaysWorked);
    }
}
