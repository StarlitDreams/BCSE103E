import alphabet.Vowels;
import alphabet.Consonants;



public class MainClass {
    public static void main(String[] args){
        String inputString = "Hello World";

        Vowels vowels = new Vowels();
        Consonants consonants = new Consonants();

        int Vowelscount=vowels.countVowels(inputString);
        int Consonantscount = consonants.countConsonants(inputString);

        System.out.println("Vowels: "+Vowelscount);
        System.out.println("Consonants: "+Consonantscount);




    }
    
}
 