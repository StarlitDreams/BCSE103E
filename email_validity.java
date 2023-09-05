/*
Write a program to validate the domain names of the email address. The fair organizers have listed the accepted domains as "com", "in", "net", and "org". Write a program to validate email addresses that have the above-listed domain names.

Create a driver class called Main. In the Main method, obtain the inputs from the console and validate the email address.

Input Format: Input consists of email address

Output format: Output prints the email address and in the next line whether the email address is valid or not.

Note: Use contains( )
email_validity
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class email_validity {
    public static boolean validateEmail(String email) {
        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|in|net|org)$";
        Pattern emailPattern = Pattern.compile(pattern);
        Matcher matcher = emailPattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        boolean isValid = validateEmail(email);

        System.out.println("\nEmail Address: " + email);
        System.out.println("Is Valid: " + isValid);

        scanner.close();
    }
}
