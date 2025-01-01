package arrays;

import java.util.ArrayList;

public class R16_linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,12,14,18};
        int target = 14;
        int index = linearSearch(arr,target,0);
        System.out.println(index);

        //for many values of target available in array
        int[] arr1 = {1,4,5,6,8,12,12,12,14,18};
        int target2 = 12;
        findAll_index(arr1,12,0);
        System.out.println(list);

    }
    static int linearSearch(int[] arr , int target,int i){
        if(i== arr.length){
            return -1;
        }else if (arr[i]==target){
            return i;
        }
        return linearSearch(arr,target,i+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll_index(int[] arr , int target,int i){
        if(i== arr.length){
            return ;
        }else if (arr[i]==target){
           list.add(i) ;
        }
        findAll_index(arr,target,i+1);
    }


}
