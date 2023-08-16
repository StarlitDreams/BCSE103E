import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {
        int i = 0;
        int small = Integer.MAX_VALUE; 
        int large = Integer.MIN_VALUE; 
        int even = 0;
        int odd = 0;
        Random rn = new Random();

        while (i < 100) {
            int rand = rn.nextInt(11);
            if (rand > large) {
                large = rand;
            }
            if (rand < small) {
                small = rand;
            }

            if (rand % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            i++;
        }

        System.out.println("The largest number: " + large +
                "\nThe smallest number: " + small +
                "\nEven numbers: " + even +
                "\nOdd numbers: " + odd);

    }
}
