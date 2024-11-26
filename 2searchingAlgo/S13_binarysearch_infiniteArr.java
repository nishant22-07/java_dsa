//******************Geeksforgeeks*****************
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//Find position of an element in a sorted array of infinite numbers
public class S13_binarysearch_infiniteArr {
    public static void main(String[] args) {
        //infinite sorted array  ........its should be infinite
        int[] arr = {-7,-5,-1,0,2,3,4,5,7,8,9,10,13,16,22,43,58};
        int target = 4;//target element to find
        int index = ans(arr,target);
        System.out.println("the index of the target ("+target+") is = "+index);
    }
    static int ans(int[] arr , int target){
        // first find the range
        // first start with box of size 2
        int start = 0;
        int end = 1;
        // if target is greater than the target element .... box size doubled
        while(target>arr[end]){
            int temp = end + 1;//new start
            end = end +(end-start+1)*2;// doubles the size of range
            start = temp;

        }return binary_search(arr,target,start,end);
    }
    // funtion of binary search to find the target element
    public static int binary_search(int[] arr,int target,int start,int end){

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
