package arrays;

public class R15_isArrSorted {
    public static void main(String[] args) {
        int[] arr = {-1,0,0,6,7,9};
        boolean isSorted = arrSorted(arr);
        System.out.println(isSorted);
    }
    static boolean arrSorted(int[] arr){
        return helper(arr,0);

    }
    static boolean helper(int[]arr , int start){
        if(start== arr.length-1){
            return true;
        }
        if(arr[start]<=arr[start+1]){
            return helper(arr,start+1);
        }
        return false;
    }
}
