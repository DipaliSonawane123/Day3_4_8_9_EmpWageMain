/* Ability to save the Total Wage for Each Company - Note: You can Create
    EmpWageBuilder for each Company
    - Use Instance Variable instead of
      function parameters*/
package com.employeewage;

import java.util.Scanner;

public class EmployeeWageBuilder {
    final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;
    int wagePerHr;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs = 0;
    static int i;
    static int company1TotalWage;
    static int company2TotalWage;

    public int employeeWage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        wagePerHr = scanner.nextInt();
        System.out.println("Enter the total Working days: ");
        totalWorkingDays = scanner.nextInt();
        System.out.println("Enter the total working hrs in a month: ");
        totalWorkingHrs = scanner.nextInt();

        for (i = 0; i < totalWorkingDays && workedHrs < totalWorkingHrs; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case FULL_TIME_WORKER -> empHrs = 8;
                case PART_TIME_WORKER -> empHrs = 4;
            }
            int empWage = empHrs * wagePerHr;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage += empWage;
            workedHrs += empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
        return monthlyWage;
    }

    public static void main(String[] args) {

        EmployeeWageBuilder company1 = new EmployeeWageBuilder();
        EmployeeWageBuilder company2 = new EmployeeWageBuilder();

        company1TotalWage = company1.employeeWage();
        System.out.println("Employee wage for company1: " + company1TotalWage);
        System.out.println("***************************************************");
        company2TotalWage = company2.employeeWage();
        System.out.println("Employee wage for company2: " + company2TotalWage);
    }
}