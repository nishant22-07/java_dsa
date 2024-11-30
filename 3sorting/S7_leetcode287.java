//leetcode 287 . find duplicate numbers
//https://leetcode.com/problems/find-the-duplicate-number/description/
// Microsoft
class S7_leetcode287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);

    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i+1){
                int correct = nums[i]-1;
                if (nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }return -1;


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}