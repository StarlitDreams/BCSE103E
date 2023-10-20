/* Create a user-defined exception called MyException that verifies the user's

mark. If the user entered a negative mark, MyException would be thrown with

the message "Mark is Negative," otherwise it would be thrown with the

message "Mark is Positive." */

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}


public class exception5 {
    public static void main(String[] args) {
        try {
            int userMark = getUserMark(); 
            validateMark(userMark);       
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    public static int getUserMark() {
        System.out.print("Enter your mark: ");
        int input = Integer.parseInt(System.console().readLine());
        return input;
    }

    
    public static void validateMark(int mark) throws MyException {
        if (mark < 0) {
            throw new MyException("Mark is Negative");
        } else {
            throw new MyException("Mark is Positive");
        }
    }
}
