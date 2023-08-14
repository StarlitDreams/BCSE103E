/*
Write a java program to accept the monthly income of an employee and display the income tax to be paid at the end of the year according to the following criteria:

Annual income (in Rs)                                     Income Tax

> 1000000                                                           4 %

> 500000 and <= 1000000                                 2 %

<= 500000                                                           NIL

 

Sample Input/ Output format

Input:

Annual income

Output:

Tax
 */

import java.util.*;
public class income_tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income > 1000000){

            System.out.println((int)(income*0.04));
        }
        else if(income > 500000 && income <= 1000000){
            System.out.println((int)(income*0.02));
        }
        else{
            System.out.println("NIL");
        }


        sc.close();


    }

    
}
