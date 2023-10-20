/* Create a Java program to verify a person's driving and voting eligibility. Check the

user is younger than 18 by reading their age. Throw an Arithmetic Exception to the

method that was invoked ,if this condition was met; else, print eligible to vote.
 */



class exception4 {

    public static void main(String[] args) {
        try {
            int userInput = readUserInput();
            processUserInput(userInput);
        } catch (ArithmeticException e) {
            System.out.println("Age below 18 can't vote.");
        }
    }

    public static int readUserInput() throws ArithmeticException {
        System.out.print("Enter your age: ");
        int input = Integer.parseInt(System.console().readLine());
        if (input < 18) {
            throw new ArithmeticException();
        } 
        
        return input;
    }

    
    public static void processUserInput(int userInput) {
        System.out.println("You can vote ");
    }
}
