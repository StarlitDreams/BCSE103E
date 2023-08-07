/*
 Write a Java program that keeps a number from the user and generates an integer

between 1 and 7 and displays the name of the weekday 

(1) Condition: Use Switch case
 */

import java.util.*;

public class weekday_switch {
    public static void main(String args[])throws Exception{
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the weekday number: ");     
        int day=myobj.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("Invalid input!");
                break;

        }


        myobj.close();

    }
}