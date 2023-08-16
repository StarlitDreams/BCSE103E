/*
 Write a Java program to preform sequential search and binary search
 */

public class sequential_search_binary_search {
    
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 5;
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        
        // Sequential search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
        
        // Binary search
        while (low <= high) {
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
