// 448 .Find all numbers disappeared in array
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// GOOGLE COMPANY
import java.util.ArrayList;
public class S6_leetcode{
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    public   static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++; 
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int  index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }return ans;
    }
    static void swap(int[] arr , int first ,int second ){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

   
    
