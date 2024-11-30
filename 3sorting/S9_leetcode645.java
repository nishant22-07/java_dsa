//645.Set Mismatch
//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;
public class S9_leetcode645 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0 ;
        while(i<nums.length){
            int correct = nums[i]-1;
            if( nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else{
                i++;
            }

        }
        int[] arr = new int[2];
        for(int index = 0 ; index< nums.length ; index++){
            if(nums[index] != index+1 ){
                arr[0] = nums[index];
                arr[1] = index+1;
            }
        }return arr;


    }
    static void swap(int[] nums,int first ,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }


}
