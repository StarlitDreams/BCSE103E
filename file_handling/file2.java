/* Write a Java Program that reads on file name from the user, then displays

information about whether the file exists, whether the file is readable, whether

the file is writable, the type of file and the length of the file in bytes.

 */
import java.io.*;
import java.util.Scanner;
public class file2 {
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name");
        String filename=sc.nextLine();

        File file=new File(filename);
        if(file.exists()){
            System.out.println("File exists");
            if(file.canRead()){
                System.out.println("File is readable");
            }
            if(file.canWrite()){
                System.out.println("File is writable");
            }
            System.out.println("File type is "+filename.substring(filename.lastIndexOf('.')+1));
            System.out.println("File length is "+file.length()+" bytes");
        }
        else{
            System.out.println("File does not exist");
        }

        sc.close();

        
        
    }


    
}
