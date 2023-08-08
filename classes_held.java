/*
 (Java Program)

A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user such as Number of classes held, Number of classes
attended and also student medical proof availability [1(for Yes)/0 (for No)]. 
Display percentage of class attended and eligibility detail (Allowed/ Not Allowed) for exam. If student is having less than 75% but having medical proof, he/she is ‘Allowed’ for exam, otherwise ‘Not Allowed’.



Sample Input/ Output format



Input:

Number of classes held

Number of classes attended

student medical proof availability (1/0)



Output:

percentage of class attended

Allowed for exam or not


 */

import java.util.*;
public class classes_held {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        double total=myobj.nextInt();
        double attended=myobj.nextInt();
        int medical=myobj.nextInt();

        double attendance=((attended/total)*100);
        if(
            (attendance)>75 ||
            (medical==1)
        ){
            System.out.printf("%d\n",(int)attendance);
            System.out.println("Allowed");
        }else{
            System.out.printf("%d\n",(int)attendance);
            System.out.println("Not Allowed");
        }


        myobj.close();
    }
    
}