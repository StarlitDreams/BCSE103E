/*
 Write a program to check if the given number is prime or not
 */
import java.util.Scanner;

public class prime_ckecker {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag = 0;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
        sc.close();
    }
    
}
