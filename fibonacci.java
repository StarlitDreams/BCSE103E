/*
 Write a program to print he fibonacci sequence
 */
import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0; i<num-2; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
    
}
