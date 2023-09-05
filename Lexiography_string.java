/*
Write a program to check whether the string is lexicographically equal to another string

Input format: Input to get two strings

Output format: Display the output as shown in the sample output.

Note : Use compareTo( ) method from String class

if (string1 > string2) it returns a positive value(difference between the characters)

if both the strings are equal lexicographically i.e.(string1 == string2) it returns 0.

if (string1 < string2) it returns a negative value((difference between the characters)
 */
import java.util.Scanner;  
public class Lexiography_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter another string: ");
        String str2 = sc.nextLine();
        int result = str1.compareTo(str2);
        if(result == 0){
            System.out.println("Both strings are equal");
        }
        else if(result > 0){
            System.out.println("String 1 is lexicographically greater than String 2");
        }
        else{
            System.out.println("String 2 is lexicographically greater than String 1");
        }
        sc.close();
    }
    
}
