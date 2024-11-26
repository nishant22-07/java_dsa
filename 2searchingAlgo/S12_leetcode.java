public class S12_leetcode {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = first_last_occurance(arr, target);
        System.out.println("Output: [" + ans[0] + " , " + ans[1] + "]");
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = first_last_occurance(nums2, target2);
        System.out.println("Output: [" + result2[0] + " , " + result2[1] + "]");
    }

    public static int[] first_last_occurance(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {

            // to find the middle element
            int mid = start + (end - start) / 2;

            // if target is smaller thar mid
            if (target < arr[mid]) {
                end = mid - 1;
            }

            // if target is larger than the mid
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // if mid is equal to the target element
            else {
                //Potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return ans;// if the element is not present in the given array
    }
}
