/* Write a java program that reads a file and finds the most repeated word in the file.

PROCEDURE 

1. Read a file for which we need to find repeated words

2. Import required header files supporting file operations

3. Count each words and display the most frequently occurring word.
 */
import java.util.HashMap;
import java.io.*;

public class file1 {
    public static void main(String[] args) throws Exception {
        File file = new File("macbeth.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<String, Integer> map = new HashMap<>();
        String st;

        while ((st = br.readLine()) != null) {
            String[] words = st.split("\\s+"); 
            for (String word : words) {
                if (!word.isEmpty()) { 
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }

        br.close(); 

        int max = 0;
        String maxWord = "";
        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                maxWord = word;
            }
        }

        System.out.println(maxWord);
    }
}
