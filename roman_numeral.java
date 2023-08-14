/*
Write a Java program for converting the given two-digit number into its corresponding Roman numeral

Input: Two digit number

 Output: Roman numeral
 */
import java.util.*;
public class roman_numeral {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ones = num%10;
        int tens = num/10;
        String roman = "";
        if(tens == 1){
            roman += "X";
        }
        else if(tens == 2){
            roman += "XX";
        }
        else if(tens == 3){
            roman += "XXX";
        }
        else if(tens == 4){
            roman += "XL";
        }
        else if(tens == 5){
            roman += "L";
        }
        else if(tens == 6){
            roman += "LX";
        }
        else if(tens == 7){
            roman += "LXX";
        }
        else if(tens == 8){
            roman += "LXXX";
        }
        else if(tens == 9){
            roman += "XC";
        }
        if(ones == 1){
            roman += "I";
        }
        else if(ones == 2){
            roman += "II";
        }
        else if(ones == 3){
            roman += "III";
        }
        else if(ones == 4){
            roman += "IV";
        }
        else if(ones == 5){
            roman += "V";
        }
        else if(ones == 6){
            roman += "VI";
        }
        else if(ones == 7){
            roman += "VII";
        }
        else if(ones == 8){
            roman += "VIII";
        }
        else if(ones == 9){
            roman += "IX";
        }
        System.out.println(roman);
        sc.close();
    }
    
}
