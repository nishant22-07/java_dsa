//leetcode.268 MISSING NUMBER IN SORTED ARRAY 0 TO N
//https://leetcode.com/problems/missing-number/description/
public class S5_leetcode268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int missingNumber = missing_number(arr);
        System.out.println(missingNumber);
    }

    static int missing_number(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]); // Recheck current index after swap
            } else {
                i++; // Move to the next index only when current is correct
            }
        }
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }

        }return arr.length;
    }
    static void swap(int[] arr , int first ,int second ){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
