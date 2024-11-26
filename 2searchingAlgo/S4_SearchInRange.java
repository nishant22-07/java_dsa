public class S4_SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int target = 77;
        int start = 1;
        int end = 6;
        int ans =search_in_range(arr,target,start,end);
        System.out.println(ans);
    }
    static int search_in_range(int[] arr ,int target, int start ,int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end ; i++) {
            if (arr[i]==target){
                return i;
            }
        }return  -1;

    }
}
