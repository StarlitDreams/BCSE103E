/*

Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.


Example:

Input: n = 5

-------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6


--- Input ---

5
0 2 4 6 8


--- Program output ---

================================
0 2 4 6 8


--- Expected output (numbers)---

0 6
6

*/
import java.util.*;

public class Q7_array {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();

        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(myobj.nextInt());
        }
    int sum=0;
    System.out.println("================================");
        for(int x:list){
            if(x%3==0){
                System.out.printf("%d ",x);
                sum+=x;
            }
        }
        System.out.printf("%d ",sum);





        

        
        myobj.close();

    }
    
}
