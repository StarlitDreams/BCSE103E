/*
 Write a program to check if the program is a palindrome or not.
*/
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp /= 10;
        }
        if(rev == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();

    }
    
}
