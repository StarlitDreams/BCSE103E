/*
Get a DOB from the user which is an 8 digit number. Check whether it is a Lucky number or not by following the steps below: 

Step-1: Calculate the sum of the digits in the odd-numbered positions (the first, third, fifth and seventh digits) and multiply this sum by 3. 

Step-2: Calculate the sum of the digits in the even-numbered positions (the second, fourth, sixth and eighth digits) and add this to the previous result (got in step 1). Given Date of Birth is declared as a lucky number, only if the last digit of the result from step 2 is 0.  write a Java program to read the Date of Birth, if the number of digits is not 8 then print “Cannot be processed” and terminate program. If the number of digits is 8 and if the DOB is a lucky number, output the DOB with the message “Lucky Number.” If the number of digits is 8 and if the DOB is not a lucky number, output the DOB with the message “Not a Lucky Number.”

 For example the DOB is 12032003, 

the result from step 1 is 9, 

the result from step 2 is 17 

The output is 12032003, “Not a Lucky Number”.

 For example the DOB is 13101978, 

 the result from step 1 is 30, 

 the result from step 2 is 50, 

 The output is 13101978, “Lucky Number.” 

 For example if the DOB is 1110197, 

The output is “Invalid Input”


 */
import java.util.Scanner;
public class lucky_number {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int sum1=0,sum2=0;
        if(input.length()!=8){
            System.out.println("Invalid Input");
        }
        else{
            for(int i=0;i<input.length();i++){
                if(i%2==0){
                    sum1+=Integer.parseInt(String.valueOf(input.charAt(i)));
                }
                else{
                    sum2+=Integer.parseInt(String.valueOf(input.charAt(i)));
                }
            }
            sum1*=3;
            sum1+=sum2;
            if(sum1%10==0){
                System.out.println(input+", Lucky Number");
            }
            else{
                System.out.println(input+", Not a Lucky Number");
            }
        }
        scanner.close();

    }
    
    
}
