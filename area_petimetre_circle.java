/*
 Write a java program to find the area and perimetre of a circle
 */

import java.lang.Math;
import java.util.Scanner;

public class area_petimetre_circle {

    public static void main(String args[])  throws Exception{
        System.out.println("Enter the radius of the circle: ");
        Scanner myObj=new Scanner(System.in);
        int radius=myObj.nextInt();
        double area= Math.PI * radius * radius;
        double perimetre= 2* Math.PI * radius;
        System.out.println("The area is: "+ area);
        System.out.println("The petimetre is: "+ perimetre);


        myObj.close();


    }
}