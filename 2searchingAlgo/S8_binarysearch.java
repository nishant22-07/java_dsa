public class S8_binarysearch {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {-7,-5,-1,0,2,3,4,5,7,8,9,10,13,16,22};
        int target = -7;//target elemen to find
        int index = binary_search(arr,target);
        System.out.println("the index of the target ("+target+") is = "+index);
    }

    // funtion of binary search to find the target element
    public static int binary_search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {

            // to find the middle element
            int mid = start + (end-start)/2;

            // if target is smaller thar mid
            if (target < arr[mid] ) {
                end = mid -1;
            }

            // if target is larger than the mid
            else if (target > arr[mid]) {
                start = mid +1;
            }
            // if mid is equal to the target element
            else{
                return mid;
            }

        }return  -1;// if the element is not present in the given array
    }
}
