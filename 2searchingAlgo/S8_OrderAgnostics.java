public class S8_OrderAgnostics {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {22,19,18,9,6,4,2,1,0,-2,-4};
        int target = 45;//target elemen to find
        int index = binary_search(arr,target);
        System.out.println("the index of the target ("+target+") is = "+index);
    }

    // funtion of binary search to find the target element
    public static int binary_search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while (start<=end) {

            // to find the middle element
            int mid = start + (end-start)/2;

            // if mid is equal to the target element
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                // if target is smaller thar mid
                if (target < arr[mid] ) {
                    end = mid -1;
                }

                // if target is larger than the mid
                else if (target > arr[mid]) {
                    start = mid +1;
                }
                }
                else{
                // if target is smaller than mid
                if (target < arr[mid] ) {
                    start = mid +1;
                }
                // if target is larger than the mid
                else if (target > arr[mid]) {
                    end = mid -1;
                }

            }
        }return -1;// if the element is not present in the given array
    }
}
