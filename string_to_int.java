/*
Write a program to convert a String to an int.

            Note: If the string contains a character then print 0

            Eg: a1b2 here the input contains characters, so conversion is not possible

Input format: A number as a string

Output format: Integer converted from a string

Note: Use Integer.parseInt( )
 */
import java.util.Scanner;
public class string_to_int {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        try{
            int num = Integer.parseInt(str);
            System.out.println("The integer value of the string is: " + num);
        }
        catch(NumberFormatException e){
            System.out.println("0");
        }
        sc.close();

    }
    
}
