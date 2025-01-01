package arrays;

public class R18_binarySearchRotatedArr {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 1;
        int index = search(arr,target,0,arr.length-1);
        System.out.println(index);
    }
    static int search(int[] arr , int target,int start , int end) {
        if (start > end) {
            return -1;// Base case: target not found
        }
        int mid = start + (end - start) / 2;
        // middle element is equal to target element
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left half is sorted
        if (arr[start] <= arr[mid]) {
            // Check if the target lies in the sorted left half
            if (target >= arr[start] && target <= arr[mid]) {
                end = mid - 1;
                return search(arr, target, start, end);
            } else {//otherwise search in right half
                start = mid + 1;
                return search(arr, target, start, end);
            }
        }

        // Otherwise, the right half is sorted
        if (target >= arr[mid] && target <= arr[end]) {
            start = mid + 1;
            return search(arr, target, start, end);

        } else {// otherwise search in left half
            end = mid - 1;
            return search(arr, target, start, end);
        }
    }
}
