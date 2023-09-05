/*
Write a program to display the middle value of the string. If the string is odd then display the single element in the middle, if even then display two elements from the middle.

Input format:

Input to get a string

Output format:

Display the middle element in the output

*/
import java.util.Scanner;
public class middle_value_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        if(len % 2 == 0){
            System.out.println("The middle value of the string is: " + str.charAt(len/2 - 1) + str.charAt(len/2));
        }
        else{
            System.out.println("The middle value of the string is: " + str.charAt(len/2));
        }
        sc.close();

    }
    
}
