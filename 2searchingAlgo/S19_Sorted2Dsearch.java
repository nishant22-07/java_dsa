import java.util.Arrays;

public class S19_Sorted2Dsearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 14 ;

        System.out.println(Arrays.toString(search(matrix,target)));
    }
    public static int[] search(int[][] matrix , int target ){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        int r = matrix.length;
        int c = matrix[0].length-1;
        int start = 0;
        int end = r*c-1;


        while(start<end){
            int mid = start + (end - start)/2;
            int row = mid/c;
            int col = mid% c;
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
           if(matrix[row][col]<target){
               start = mid +1;
            }else {
                end = mid - 1;
            }
        }return new int[] {-1,-1};
    }
}




















