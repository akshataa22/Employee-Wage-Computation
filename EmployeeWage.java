package com.day8;

import java.util.Random;

public class EmployeeWage {
    private static final int wagePerHour = 20;
    private static final int fullDayHour = 8;
    private static final int partTimeHour = 4;
    private static final int maxWorkingDays = 20;
    private static final int maxWorkingHours = 100;

    private int totalWage;
    private int totalHoursWorked;
    private int totalDaysWorked;

    private void calculateWage() {
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
    }

    private void displayTotalWage() {
        System.out.println("Total Wages for a month: " + totalWage);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Total Days Worked: " + totalDaysWorked);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        EmployeeWage wageCompute = new EmployeeWage();
        wageCompute.calculateWage();

        wageCompute.displayTotalWage();
    }
}

