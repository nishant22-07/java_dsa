public class S15_leetcode1095 {
    public static void main(String[] args) {
        int[] mountainarr =  { 1,2,3,4,5,3,1};
        int target = 6 ;
        int ans = Search_in_mountain(mountainarr,target);
        System.out.println(ans);

    }
   static int Search_in_mountain(int[] arr,int target){
        int peak = peak_in_mountain(arr);
       int start = 0;
       int end = arr.length-1;
        //find in asc first half
      int firstTry = binary_search(arr,target,start,peak);
      // find in dec second half
       int secondTry = binary_search(arr,target,peak+1,end);
       if (firstTry!=-1){
           return firstTry;
       }
           return secondTry;

   }
    static int peak_in_mountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] > arr[mid + 1]) {
                //you are in dec  part of array
                // this may be ans but look at left
                // this is why end != mid -1
                end = mid; // Peak is in the left part (including mid)
            } else {
                // you are in asc part of array... because we know that mid + 1 element > mid element
                start = mid + 1; // Peak is in the right part (excluding mid)
            }
        }return start; // or return end; both are the same (start== end)
    }
    public static int binary_search(int[] arr,int target,int start,int end){

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
