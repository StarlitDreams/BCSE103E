/*
Petrol is collected for Indian Oil Corporation for sales from nearest ‘n’ storage points to the Collection point. Given the amount of petrol from ‘n’ storage points in litres(L) and milli litres (mL), write a java program to compute the total quantity of oil in the collection point.

For example, if oil comes from 3 bunks in quantities 2 L 300 mL, 3 L 700 mL and 4 L 600 mL then the total quantity of oil in collection is 10 L 600 mL.

 

 

Input:

No. of Storage points

L and mL quantities from storage point 1

L and mL quantities from storage point 2

.

L and mL quantities from storage point N

 

Output:

Total quantity both in L and mL of oil

in collection point
 */
import java.util.*;

public class StoragePoints {
    public static void main(String args[]) throws Exception {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        List<Double> data = new ArrayList<Double>();

        for (int i = 0; i < n; i++) {
            double litres = myobj.nextDouble();
            double millilitres = myobj.nextDouble();
            double totalLitres = litres + (millilitres / 1000); // Convert millilitres to litres
            data.add(totalLitres);
        }

        double total = 0;
        for (int i = 0; i < data.size(); i++) {
            total += data.get(i);
        }

        int totalLitres = (int) total;
        int totalMillilitres = (int) Math.round((total - totalLitres) * 1000); // Round the millilitres

        System.out.println(totalLitres);
        System.out.println(totalMillilitres);
        myobj.close();
    }
}


