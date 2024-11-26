
public class a9_max {
    public static void main(String[] args) {
        int[] arr = {1,56,3,4,5,21,18,9};
        max(arr);
        max_in_range(arr,3,6);

    }
    static void max(int[] arr){
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] >maxNum) {
                maxNum = arr[i];
            }

        }System.out.println(maxNum);
    }
    static void max_in_range(int[] arr,int start, int end){
        int maxNum = Integer.MIN_VALUE;
        for (int i =start; i <=end; i++) {
            if (arr[i] >maxNum) {
                maxNum = arr[i];
            }

        }System.out.println(maxNum);
    }
}
