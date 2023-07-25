import java.util.Scanner; 

public class factorial {
    public int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String args[]) throws Exception {
        factorial factorial = new factorial();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value you want to find the factorial of:");
        int num=myObj.nextInt();
        int result = factorial.fact(num);
        System.out.println("Factorial of " + num + " is: " + result);

        myObj.close();

    }
}
