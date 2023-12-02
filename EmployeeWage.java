package com.day8;

import java.util.Random;

public class EmployeeWage {
    private static void computeEmployeeWage(String companyName, int wagePerHour, int fullDayHour,
                                            int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        int totalWage = 0;
        int totalHoursWorked = 0;
        int totalDaysWorked = 0;

        while (totalDaysWorked < maxWorkingDays && totalHoursWorked < maxWorkingHours) {
            int empCheck = new Random().nextInt(3); // using random function to generate 0, 1, or 2

            int dailyWage = 0;
            int dailyHoursWorked = 0;

            switch (empCheck) {
                case 0:
                    System.out.println(companyName + " - Day " + (totalDaysWorked + 1) + ": Employee is Absent.");
                    break;
                case 1:
                    System.out.println(companyName + " - Day " + (totalDaysWorked + 1) + ": Employee is Present Full Day.");
                    dailyHoursWorked = fullDayHour;
                    break;
                case 2:
                    System.out.println(companyName + " - Day " + (totalDaysWorked + 1) + ": Employee is Present Half Day.");
                    dailyHoursWorked = partTimeHour;
                    break;
            }

            totalDaysWorked++;
            totalHoursWorked += dailyHoursWorked;
            dailyWage = wagePerHour * dailyHoursWorked;
            totalWage += dailyWage;
            System.out.println("Daily Wage: " + dailyWage);
        }

        System.out.println(companyName + " - Total Wages for a month: " + totalWage);
        System.out.println(companyName + " - Total Hours Worked: " + totalHoursWorked);
        System.out.println(companyName + " - Total Days Worked: " + totalDaysWorked);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        computeEmployeeWage("Company A", 20, 8, 4, 20, 100);
        computeEmployeeWage("Company B", 25, 9, 5, 22, 110);
    }
}
