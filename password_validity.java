/*
A website requires the users to input username and password to register. Write a program to

check the Validity of password input by users. Following are the criteria for checking the

password:

1. At least 1 letter between [a-z]

2. At least 1 number between [0-9]

3. At least 1 letter between [A-Z]

4. At least 1 character from [$#@]

5. Minimum length of transaction password: 6

6. Maximum length of transaction password: 12

Your program should accept a sequence of comma separated passwords and will check them

according to the above criteria. Passwords that match the criteria are to be printed, each

separated by a comma. If none of the password is valid, you should print “invalid” (Hard)
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class password_validity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();

        String[] passwords = input.split(",");
        StringBuilder validPasswords = new StringBuilder();

        String regex = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[$#@]).{6,12}$";
        Pattern pattern = Pattern.compile(regex);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password.trim());
            if (matcher.matches()) {
                if (validPasswords.length() > 0) {
                    validPasswords.append(", ");
                }
                validPasswords.append(password);
            }
        }

        if (validPasswords.length() > 0) {
            System.out.println(validPasswords);
        } else {
            System.out.println("invalid");
        }
        scanner.close();
    }
}
