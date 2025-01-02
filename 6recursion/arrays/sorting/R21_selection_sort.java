package arrays.sorting;

import java.util.Arrays;

public class R21_selection_sort {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        selection(arr1, arr1.length, 0, 0); // Start the selection sort
        System.out.println(Arrays.toString(arr1)); // Print the sorted array
    }

    // Selection sort using recursion
    static void selection(int[] arr, int r, int c, int max) {
        // Base case: When r == 0, the array is fully sorted
        if (r == 0) {
            return;
        }

        // Recursive case 1: Find the maximum element in the unsorted portion
        if (c < r) {
            // Update max if the current element is larger
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c); // Move to the next element with updated max
            } else {
                selection(arr, r, c + 1, max); // Move to the next element without updating max
            }
        } else {
            // Recursive case 2: Swap the maximum element with the last element in the unsorted portion
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // Start the next pass with a reduced unsorted portion
            selection(arr, r - 1, 0, 0);
        }
    }
}
