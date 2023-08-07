/*
 Write a Java program that accepts three numbers and prints "All numbers are equal" if

all three numbers are equal, "All numbers are different" if all three numbers are

different and "Neither all are equal or different" otherwise 

(1) Condition: Use Logical operators
 */

import java.util.*;

public class numbers_equal {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=myobj.nextInt();
        System.out.println("Enter the second number: ");
        int num2=myobj.nextInt();
        System.out.println("Enter the third number: ");
        int num3=myobj.nextInt();
        if(
            num1==num2 &&
            num1==num3 &&
            num2==num3
        ){
            System.out.println("All numbers are equal");
        }else if(
            num1!=num2 &&
            num1!=num3 &&
            num2!=num3
        ){
            System.out.println("All numbers are different");

        }else{
            System.out.println("Neither all are equal or different");
        }
        myobj.close();
        }
}




