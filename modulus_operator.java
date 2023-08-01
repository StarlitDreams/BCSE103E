/*
 Write a program to calculate the sum of the first and the second last digit of 5 digits and fond the difference between of first and the Third last digit of 5 digits 

 (1) Condition: Use modulus operator 

E.g - Number: 12345 

Output: 1+4 = 5

Output :1-3= -2
 */

import java.util.Scanner;
public class modulus_operator {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=myobj.nextInt();
        int first_no=(int)((number/10000)%10);
        int first_last=(int)((number/10)%10);
        int second_last=(int)((number/100)%10);
        

        System.out.printf("Output:%d\n",first_no+first_last);
        System.out.printf("Output:%d",first_no-second_last);

        myobj.close();

    }
}
