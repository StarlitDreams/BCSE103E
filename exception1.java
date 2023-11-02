/*
(ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:

■ Creates an array with 100 randomly chosen integers.

■ Prompts the user to enter the index of the array, then displays the corresponding element

value. If the specified index is out of bounds, display the message Out of Bounds.
*/
import java.util.Random;
import java.util.Scanner;

 class exception1{
    public static void main(String Args[]){
        int[] arr=new int[100];
        Random rand=new Random();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<100;i++){
            arr[i]=rand.nextInt(100);

        }
        
        System.out.println("Enter the index you want to check: ");
        int index= sc.nextInt();
        try{
            System.out.print(arr[index]);

        }catch(ArrayIndexOutOfBoundsException e){System.out.print(e);}


        sc.close();

    }
 }