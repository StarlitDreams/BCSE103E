/*
Calculate the toll charge, by considering kilometers travelled by vehicle. Display the toll charge of the two-wheeler to be paid as per chart below. 

kilometers  travelled                  Charge 

KmTr <=1000KM                           0 

1000KM< KmTr <= 10000           50 

10000KM < KmTr <= 20000        150 

20000KM < KmTr <= 40000         250 

40000KM < KmTr <= 60000        350 

KmTr > 60000                            500



Sample Input/ Output format

 Input: kilometers travelled 

Output: Toll charge
 */
import java.util.*;
public class toll_charge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        if(km <= 1000){
            System.out.println(0);
        }
        else if(km > 1000 && km <= 10000){
            System.out.println(50);
        }
        else if(km > 10000 && km <= 20000){
            System.out.println(150);
        }
        else if(km > 20000 && km <= 40000){
            System.out.println(250);
        }
        else if(km > 40000 && km <= 60000){
            System.out.println(350);
        }
        else{
            System.out.println(500);
        }
        sc.close();
    }
    
}
