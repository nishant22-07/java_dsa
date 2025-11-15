import java.util.Arrays;

public class S1_bubble {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int[] Array){
        for (int i = 1; i < Array.length-1 ; i++) {

            //inner loop
            for (int j = 1; j < Array.length -i ; j++) {
                if(Array[j]<Array[j-1]){
                    int temp = Array[j];
                    Array[j] = Array[j-1];
                    Array[j-1] = temp;
                }
            }

        }
    }
}
