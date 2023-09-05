/*
Days of a Month:

Write a program that prompts the user to enter a year and the first three letters of a month's name (with the first letter in uppercase) and displays the number of days in the month

Sample run: Enter a year: 2021

Enter a month: Jan

Jan 21 has 31 days
 */
import java.util.Scanner;
public class days_of_month {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        System.out.println("Enter a month: ");
        String month = sc.next();
        int days = 0;
        switch(month){
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Feb":
                if(year % 4 == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println(month + " " + year + " has " + days + " days");

        sc.close();
    }
    
}
