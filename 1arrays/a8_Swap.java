import java.util.Arrays;
import java.util.Scanner;


public class a8_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
//        Swap_function(arr ,4,3);
        reverseArray(arr);
    }
    public static void Swap_function(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }

   static void reverseArray(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start < end ){
            Swap_function(arr,start,end);
            start++;
            end--;

        }

   }
}
