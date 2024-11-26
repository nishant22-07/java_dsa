
public class S3_min {
    public static void main(String[] args) {
        int[] arr = {1, 56, 3, 4, -1, 21, -19, 9};
        //min(arr);
        min_in_range(arr, 1, 3);

    }

    //    static void min(int[] arr) {
//        int minNum = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] < minNum) {
//                minNum = arr[i];
//            }
//
//        }System.out.println(minNum);
//    }
    static void min_in_range(int[] arr, int start, int end) {
        int minNum = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }

        }
        System.out.println(minNum);
    }
}

