public class maximum_minimum {
    public static void main(String[] args) {
        int[] arr = { 78, 90, 1, -8, 100, 150 };

        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
    
}
