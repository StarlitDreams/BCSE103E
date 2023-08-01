/*
 Consider the following code int i = 10; int n = i++%5;
 a. What are the values of i and n after the code is executed?
 b. What are the final value of i and n if instead of using the postfix operator than the prefix operator for variable i?
 */
public class Basic_Q5 {
    public static void main(String args[]){
        int i = 10;
        int n = i++%5;
        System.out.println("values of i and n after the code is executed: ");
        System.out.println("i = " + i);
        System.out.println("n = " + n);
        System.out.println("final value of i and n if instead of using the postfix operator than the prefix operator for variable i: ");
        i = 10;
        n = ++i%5;
        System.out.println("i = " + i);
        System.out.println("n = " + n);
    }
    
}
