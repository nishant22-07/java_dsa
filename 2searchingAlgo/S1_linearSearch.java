public class S1_linearSearch {

    //Search in arrry to find item and return index
    // if not found return -1
    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr.length== 0) {
                return -1;
            }
            if (arr[i]==target) {
                return i;
            }

        } return -1;

    }
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int target = 14 ;
        int ans = linearSearch(arr,target);
        System.out.println(ans);



    }
}
