public class R5_binarySearch_recursion {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,1,3,4,5,6,9,76};
        int target = 2 ;
        int ans = search(arr,target , 0 , arr.length-1);
        System.out.println(ans);

    }
    public static int search(int[] arr , int target , int s , int e){
        if (s > e) {
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        } else if (target < arr[mid]) {
            e = mid - 1 ;
        } else {
            s = mid + 1 ;
        }
        return search(arr,target,s,e);
    }
}
