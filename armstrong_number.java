/*
 Write a program to find if the number is an armstrong number or not.
 */
import java.util.*;
public class armstrong_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int digit = temp%10;
            sum += digit*digit*digit;
            temp /= 10;
        }
        if(sum == num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
    
}
