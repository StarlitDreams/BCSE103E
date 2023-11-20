import java.io.*;
public class practice {
    public static void main(String[] args){
        String filename=args[0];
        try(BufferedReader reader= new BufferedReader(new FileReader(filename))){
            String line;
            while((line=reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }

    }

    
}
