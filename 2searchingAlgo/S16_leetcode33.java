public class S16_leetcode33 {
    public static void main(String[] args) {
        int[] rotatedArr =  {4,5,6,7,0,1,2};
        int target = 0;
        int ans = Search_in_rotatedArr(rotatedArr,target);
        System.out.println(ans);

    }
   static int Search_in_rotatedArr(int[] arr,int target){
        int pivot = pivot_in_rotated(arr);
       int start = 0;
       int end = arr.length-1;
        //find in asc first half
      int firstTry = binary_search(arr,target,start,pivot);
      // find in asc second half
       int secondTry = binary_search(arr,target,pivot+1,end);
       if (firstTry!=-1){
           return firstTry;
       }
           return secondTry;//if not found in first half

   }
    static int pivot_in_rotated(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // Peak is in the left part (including mid)
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }else {
                start = mid +1;
            }
        }return -1;
    }


     static int binary_search(int[] arr,int target,int start,int end){

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

