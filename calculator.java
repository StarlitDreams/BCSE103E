import java.io.*;
import java.util.*;


public class calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String args[]) throws Exception{
        System.out.println("Welcome to my calculator V1.0");
        System.out.println("The options are:\n1.Addition\n2.Subsctraction\n3.Multiplication\n4.Division");
        System.out.println("Enter the option you want: ");
        Scanner myObj=new Scanner(System.in);
        int input= myObj.nextInt();
        System.out.println("Enter the first number: ");
        int num1=myObj.nextInt();
        System.out.println("Enter the second number:");
        int num2=myObj.nextInt();

        switch(input){
            case 1:
                System.out.println("The sum of the numbers is: "+ calculator.add(num1,num2));
                break;
            case 2:
                System.out.println("The difference of the numbers is: "+ calculator.sub(num1,num2));
                break;
            case 3:
                System.out.println("The multiplication of the numbers is: "+ calculator.mul(num1,num2));
                break;
            case 4:
                System.out.println("The division of the numbers is: "+ calculator.div(num1,num2));
                break;
            default:
                System.out.println("Invalid option! ");

        }

        myObj.close();


    }
    
}
