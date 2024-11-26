public class S9_CeilingOfNumber {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {-7,-5,-1,0,2,3,4,5,7,8,9,10,13,16,22};
        int target = 21;//target element to find
        int index = celing_of_number(arr,target);
        System.out.println("the index of the celing of  ("+target+") is = "+index);
    }

    // funtion to find ceiling of the number (index of element >= target )
    public static int celing_of_number(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        // what if the target element is greater than the greatest element in the array
        if(target > arr[end]){
            return -1;
        }

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

        }return  start;
    }
}
