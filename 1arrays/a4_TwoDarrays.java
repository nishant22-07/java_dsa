import java.util.Arrays;
import java.util.Scanner;

public class a4_TwoDarrays
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9

         */
//        int[][] a1_arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        //        int[][] arr2D ={
//                {1,2,3},//0th index
//                {4,5},// 1st index
//                {6,7,8,9}//2nd index -> arr2D[2] = {6,7,8,9};
//        };
//    }

        //INPUT
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length ;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for(int[] a :arr ){
            System.out.println(Arrays.toString(a));
        }


//            Output
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length;j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//
//        }

        //OUTPUT
        //METHOD 1
//        for (int i = 0; i < a1_arr.length; i++) {
//            for (int j = 0; j < a1_arr[i].length;j++) {
//               System.out.print(a1_arr[i][j]+ " ");
//            }
//            System.out.println();
//
//        }
            // method 2
//        for (int i = 0; i < a1_arr.length; i++) {
//            System.out.println(Arrays.toString(a1_arr[i]));
//        }
        //inhanced for loop
//        for (int[] a : a1_arr){
//            System.out.println(Arrays.toString(a));
//        }

        // For Array of string
//        String[] a1_arr = new String[4];
//        System.out.println(a1_arr[0]);
//        for(String element : a1_arr){
//            System.out.println(element);
//            }
        }
    }



