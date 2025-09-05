import java.util.Arrays;

public class S5_twoD_arr_linearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,22,3},
                {777,0,6},
                {22,8,9}
        };

//         FOR FINDING THE TARGET ELEMENT IN THE TWO D ARRAY
        int target = 8;
        int[] ans = linear_search( arr,target);
        System.out.println(Arrays.toString(ans));


        // FOR FINDING THE MAX NUMBER IN ARRAY
//        int maxNUM = max(arr);
//        System.out.println(maxNUM);


//        int minNUM = min(arr);
//        System.out.println(minNUM);

    }
//       //FUNCTION FOR FINDING THE TARGET ELEMENT IN THE TWO D ARRAY
// here for the function return type is in term of arrays (int[])
    static int[] linear_search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};

                }

            }

        }return new int[]{-1,-1};

    }


    // FUNCTION FOR FINDING THE MAX NUMBER OF THE ARRAY
    static int max(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int maxNum = Integer.MIN_VALUE;
        for (int ints[]:arr) {
            for (int element:ints) {
                if (maxNum < element) {
                    maxNum = element;

                }

            }

        }return maxNum;
    }


    // FUNCTION FOR FINDING THE MIN NUMBER OF THE ARRAY

    static int min(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int minNUm = Integer.MAX_VALUE;
        for (int ints[]:arr) {
            for (int element:ints) {
                if (minNUm > element) {
                    minNUm = element;

                }

            }

        }return minNUm;
    }

}
