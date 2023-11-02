/* 
Yeswant want to submit a short story for a competition but his document

should meet the word count provided. Help yeswant count the number of

characters, words and line in his file by a Java Program.



PROCEDURE 

1. Create a class named FileStat

2. Write main method

3. Create BufferedReader object to receive the file name passed through

command line.

4. Read the number of words, lines and characters

(Refer PPT in TG1 slot)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStat {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStat <filename>");
            return;
        }

        String fileName = args[0];
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                charCount += line.length();
                wordCount += line.split("\\s+").length; 
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
