package patterns;

import java.util.Arrays;

public class R19_triangle {
    public static void main(String[] args) {
//        triangle2(4,0);
//        int[] arr = {6,3,2,1,7,9,5};
//        System.out.println();
//        bubble_sort(arr,arr.length-1,0);
//        System.out.println(Arrays.toString(arr));

        //for selection sort
        int[] arr1 = {10,3,12,1,4,7,9,5};
        selection(arr1,arr1.length,0,0);
        System.out.println(Arrays.toString(arr1));

        }
//    static void triangle2(int r,int c){
//        if(r==0){
//            return;
//        }
//        if(r>c){
//            triangle2(r,c+1);
//            System.out.print("*");
//        }else {
//            triangle2(r-1,0);
//            System.out.println();
//
//        }
//
//    }
//
//    static void triangle(int r,int c){
//        if(r==0){
//            return;
//        }
//        if(r>c){
//            System.out.print("*");
//            triangle(r,c+1);
//        }else {
//            System.out.println();
//            triangle(r-1,0);
//        }
//
//    }
//
//    // Bubble Sort using recursion
//// r: represents the last index of the unsorted portion of the array
//// c: represents the current index being compared within a single pass
//    static void bubble_sort(int[] arr, int r, int c) {
//        // Base condition: if r (last index of the unsorted portion) reaches 0,
//        // the entire array is sorted, and we can stop recursion.
//        if (r == 0) {
//            return;
//        }
//
//        // Recursive case: Perform a single pass of the bubble sort
//        if (c < r) { // Ensure we stay within the unsorted portion of the array
//            // Compare adjacent elements and swap if needed
//            if (arr[c] > arr[c + 1]) {
//                // Swap elements at index c and c+1 if they are out of order
//                int temp = arr[c];
//                arr[c] = arr[c + 1];
//                arr[c + 1] = temp;
//            }
//
//            // Recursive call for the next pair in the current pass
//            bubble_sort(arr, r, c + 1);
//        } else {
//            // If the current pass is complete, move to the next pass by reducing r
//            // Reset c to 0 for the next pass to start from the beginning of the array
//            bubble_sort(arr, r - 1, 0);
//        }
//    }

    //selection sort
    static void selection(int[] arr,int r, int c , int max ){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }else {
                selection(arr,r,c+1,max);
            }
            }else {
            int temp = arr[max];
            arr[max]=arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }

    }




}