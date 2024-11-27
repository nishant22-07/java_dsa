import java.util.Arrays;

public class S3_Insertion {
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1,0,-1,0,1,2,3,-19};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }

            }

        }
    }
    static void swap(int[] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
