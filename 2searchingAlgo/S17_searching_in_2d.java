import java.util.Arrays;

public class S17_searching_in_2d {
    public static void main(String[] args) {
        int[][] a1_arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        int[] ans  = search(a1_arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }

            }

        }return new int[]{-1};
    }
}
