package com.day8;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage computation program.");

        final int workingDays = 20;
        for (int day = 0; day < workingDays; day++) {
            int empCheck = new Random().nextInt(2); // using random function to generate 0 and 1
            if (empCheck == 1) {
                System.out.println("Day " + (day + 1) + ": Employee is Present.");
            } else {
                System.out.println("Day " + (day + 1) + ": Employee is absent.");
            }
        }
    }
}
