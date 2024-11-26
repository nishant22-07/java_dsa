import java.util.Scanner;
import java.util.Arrays;
public class a3_input {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        a1_arr[0] = 23;
//        a1_arr[1] = 3;
//        a1_arr[2] = 0;
//        a1_arr[3] = 43;
//        a1_arr[4] = 2;
//        System.out.println(a1_arr[4]);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < a1_arr.length; i++) {
//            System.out.println(a1_arr[i]);
//        }


    }
}
