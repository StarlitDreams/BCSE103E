/*
 Write a program to get 5 inputs from user and find the sum and average 

 Condition: Use for loop & Compound assignment operator
 */
import java.util.Scanner;
public class sum_average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            sum += num;
        }
        avg = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
