import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class A10_revision {
    // function to print numbers greater than target element
    public static void NumsGreaterThanTargetElement(int[] arr , int target)  {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            if(num>target){
                result.add(num);
            }
        }
        for (int i = 0; i < result.size() ; i++) {
            System.out.print(result.get(i) + " ");

        }

    }

    //function to return array of numbers greater than target element
    public static int[] arrOfNumsGreaterThanTarget(int[] arr , int target){
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr){
            if(num>target){
                result.add(num);
            }
        }
        // convert arraylist to array
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size();i++){
            resultArray[i] = result.get(i);

        }
        return resultArray;

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,6,6,6,9,8};
        int target = 4;
        NumsGreaterThanTargetElement(arr,target);
        System.out.println();
        int[] result = arrOfNumsGreaterThanTarget(arr,4);
        System.out.println(Arrays.toString(result));

    }
}
