import java.util.Arrays;

public class S2_selection {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,-1,0};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last_Index = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, last_Index);
            swap(arr , maxIndex , last_Index );

        }

    }
    private static int getMaxIndex(int[] arr ,int end){
        int maxIndex = 0;
        for (int i = 0; i <=end; i++) {
            if (arr[maxIndex]<arr[i]){
                maxIndex = i;
            }

        }return maxIndex;

    }
    static  void swap(int[] arr , int first, int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
