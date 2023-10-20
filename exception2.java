/* Write a Java Program that implements the hex2Dec(String hexString) method, which

converts a hex string into a decimal number. Implement the hex2Dec method to throw a

NumberFormatException if the string is not a hex string.

 */
import java.util.Scanner;
public class exception2 {
    public static int hex2Dec(String hexString){
        if(hexString == null || hexString.isEmpty()){
            throw new IllegalArgumentException("Input string cannot be null or empty ");
        }

        if(hexString.startsWith("0x")){
            hexString=hexString.substring(2);

        }
        int decimal=0;
        int lenght=hexString.length();
        for(int i=0;i<lenght;i++){
            char hexChar=hexString.charAt(i);
            int digit=Character.digit(hexChar,16);
            if(digit==-1){
                throw new NumberFormatException(hexString); 
            }
            decimal=decimal*16+digit;
        }
        return decimal;
    }
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        String hexString= sc.next();
        System.out.println(hex2Dec(hexString));

        sc.close();
    }
    
}
