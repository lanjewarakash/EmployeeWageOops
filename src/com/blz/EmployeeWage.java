package com.blz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        int wagePerHour = 20;
        int isFullTime = 1;
        int empHrs ;
        int empWages ;
        int fullDayHour = 0;
        int partTimeHour = 1;
        int dailyWage;
        int dailyEmpWage=0;
        int workingDays = 20;
        int empWage;
        int totalEmpWage =0;

        int empCheck = (int)Math.floor(Math.random()*10)%2;
        System.out.println(empCheck);
        if (empCheck==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

        if (empCheck ==isFullTime){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empWages = (wagePerHour * empHrs);
        System.out.println("The employee Wages are : " +empWages);

        if (empCheck == fullDayHour){
            empHrs=8;
        }
        else if (empCheck == partTimeHour) {
            empHrs = 4;
        }
        else {
            empHrs=0;
        }
        dailyWage = (wagePerHour * empHrs);
        System.out.println("The employee Wages are : " +dailyWage);
        switch(empCheck){
            case 0:
                empHrs=8;
                break;
            case 1:
                empHrs=4;
                break;
            default:
                empHrs=0;
        }
        dailyEmpWage =(wagePerHour*empHrs);
        System.out.println("Emp Wages are " +dailyEmpWage);

        for(int Day = 0; Day<workingDays; Day++){

            switch(empCheck){
                case 0:
                    empHrs=8;
                    break;
                case 1:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
            }
            empWage=(empHrs*wagePerHour);
            totalEmpWage +=empWage;
            System.out.println("empWage = " +empWage);

        }
        System.out.println("TotalEmpWage = " +totalEmpWage);
    }
}
