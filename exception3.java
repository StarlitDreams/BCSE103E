/* Demonstrate the usage of throws keyword in exception handling mechanism

with the following things.

Read an integer from user’s input and check the value is lesser than 1

Method taking this user’s input throws IO Exception and Arithmetic

Exception

Print IO Exception, if the condition was met;else print Arithmetic Exception.
 */


import java.io.IOException;

class exception3 {

    public static void main(String[] args) {
        try {
            int userInput = readUserInput();
            processUserInput(userInput);
        } catch (IOException e) {
            System.out.println("IO Exception: Input value should be greater than 1.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception.");
        }
    }

    public static int readUserInput() throws IOException, ArithmeticException {
        System.out.print("Enter an integer: ");
        int input = Integer.parseInt(System.console().readLine());
        if (input <= 1) {
            throw new IOException();
        } else if (input % 2 == 0) {
            throw new ArithmeticException(); 
        }
        return input;
    }

    
    public static void processUserInput(int userInput) {
        System.out.println("Input value is: " + userInput);
    }
}
