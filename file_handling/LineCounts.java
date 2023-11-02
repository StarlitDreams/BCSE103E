import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounts {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input files provided.");
            return;
        }

        for (String fileName : args) {
            try {
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int lineCount = 0;

                while (bufferedReader.readLine() != null) {
                    lineCount++;
                }

                System.out.println("File: " + fileName + " - Number of Lines: " + lineCount);

                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}
