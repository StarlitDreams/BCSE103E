/*
 Financial Application: Payroll 

Write a program that reads the following information and prints a payroll statement:

Employee Name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g.,$9.75)
Calculate the total gross pay and display it.

An employee has deductions from the Gross pay salary like:

Federal withholding (20.0%)
State withholding (9.0%)
Calculate and display the total deduction and Net pay of an Employee

Sample output:

Employee Name:

Hours worked:

Pay rate:

Gross pay:

Deductions:

            Federal Withholding (20.0%):

            State withholding (9.0%) :

            Total Deduction:

Net pay: 

 */
import java.util.Scanner;
public class payroll {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Hours worked: ");
        double hours = sc.nextDouble();
        System.out.println("Enter Pay rate: ");
        double rate = sc.nextDouble();
        double gross = hours * rate;
        double fed = gross * 0.2;
        double state = gross * 0.09;
        double total = fed + state;
        double net = gross - total;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: " + rate);
        System.out.println("Gross pay: " + gross);
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding (20.0%): " + fed);
        System.out.println("State withholding (9.0%): " + state);
        System.out.println("Total Deduction: " + total);
        System.out.println("Net pay: " + net);

        sc.close();
    }
    
}
