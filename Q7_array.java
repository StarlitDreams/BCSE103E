import java.util.*;

public class Q7_array {
    public static void main(String args[]){
        Scanner myobj=new Scanner(System.in);
        int n=myobj.nextInt();

        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(myobj.nextInt());
        }
    System.out.println("================================");
        for(int x:list){
            if(x%2==0){
                System.out.printf("%d ",x);
            }
        }





        

        
        myobj.close();

    }
    
}
