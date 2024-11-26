public class S14_leetcode852 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,6,4,3,2};
        int ans =  peak_in_mountain(arr);
        System.out.println(ans);
    }
    static int peak_in_mountain(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;


                if (arr[mid] > arr[mid + 1]) {
                    //you are in dec  part of array
                    // this may be ans but look at left
                    // this is why end != mid -1
                    end = mid; // Peak is in the left part (including mid)
                } else {
                    // you are in asc part of array... because we know that mid + 1 element > mid element
                    start = mid + 1; // Peak is in the right part (excluding mid)
                }
            }return start; // or return end; both are the same (start== end)
    }
}

