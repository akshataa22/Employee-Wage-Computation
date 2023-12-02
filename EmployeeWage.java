package com.day8;

import java.util.Random;

interface EmpWageCalculator {
    void computeEmployeeWage();
}

class EmpWageBuilder implements EmpWageCalculator {

    private final String companyName;
    private final int wagePerHour;
    private final int fullDayHour;
    private final int partTimeHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalWage;
    private int totalHoursWorked;
    private int totalDaysWorked;

    public EmpWageBuilder(String companyName, int wagePerHour, int fullDayHour,
                          int partTimeHour, int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHour = fullDayHour;
        this.partTimeHour = partTimeHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    @Override
    public void computeEmployeeWage() {
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
}

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        // Example usage for two companies
        EmpWageCalculator companyA = new EmpWageBuilder("Company A", 20, 8, 4, 20, 100);
        companyA.computeEmployeeWage();

        EmpWageCalculator companyB = new EmpWageBuilder("Company B", 25, 9, 5, 22, 110);
        companyB.computeEmployeeWage();
    }
}
