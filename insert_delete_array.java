/*
Write a Java program to insert  (specific position)   

and delete a specific element  from an array

for example: 


input=50 45 60 78 100

2

250

output=50 45 250 60 78 100



input=60 78 90 100 150

100

output=60 78 90 150

--- Input ---
50 45 60 78 100
2
250
60

--- Program output ---
50 45 250 60 78 100
50 45 60 78 100

--- Expected output (numbers)---
50 45 250 60 78 100
50 45 250 78 100

*/
import java.util.Scanner;

public class insert_delete_array{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        int pos = scanner.nextInt();
        int num = scanner.nextInt();

        // Insertion
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i == pos) {
                arr2[i] = num;
            } else {
                arr2[i] = arr1[j++];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Deletion
        int[] newArr1 = new int[arr1.length - 1];
        int newArrIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i != pos) {
                newArr1[newArrIndex++] = arr1[i];
            }
        }
        for (int i = 0; i < newArrIndex; i++) {
            System.out.print(newArr1[i] + " ");
        }

        scanner.close();
    }
}

