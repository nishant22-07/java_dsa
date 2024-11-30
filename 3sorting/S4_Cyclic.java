import java.util.Arrays;

//when given numbers are from 1 to N
public class S4_Cyclic {
    public static void main(String[] args) {
        int[] arr = {6,7,3,2,1,4,5};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // using for loop
//    static void cyclic_sort(int[] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i] != i+1 ){
//                swap(arr,i,arr[i]-1);
//            }
//        }
//    }
    //using while loop
    static void cyclic_sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int first ,int second ){
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
