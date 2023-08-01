/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. (2) Condition: Use Math.abs() to check absolute value 

Test cases: 

1. Input a number greater than 0 

2. Input a number equal to 0 

3. Input a number less than 0 

4. Input a number greater than 1,000,000 

 */

import java.util.Scanner;
class float_true_false {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        float num = sc.nextFloat();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        if (Math.abs(num) < 1) {
            System.out.println("Small");
        } else if (Math.abs(num) > 1000000) {
            System.out.println("Large");
        }
        sc.close();
    }
 }