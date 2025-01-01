package arrays;

import java.util.ArrayList;
import java.util.List;

public class R17_linearSearchArrlist {
    public static void main(String[] args) {

        //for many values of target available in array
        int[] arr1 = {14,14,5,6,14,14,18};
        int target2 = 14;

        //list is taken as argument
        ArrayList<Integer> list = new ArrayList<>();
        find_all_values(arr1,target2,0,list );//
        System.out.println(list);

        //list is not taken as argument
        System.out.println(search(arr1,target2));
    }

    static List search(int[] arr , int target){
        ArrayList<Integer> list = new ArrayList<>();
        return find_all_values(arr , target ,0 ,list);

    }

    // helper function for search
    // but can be used indepentely passing list and index as argument
    private static ArrayList<Integer> find_all_values(int[] arr , int target, int i , ArrayList<Integer> list){
        if(i== arr.length){
            return list ;
        }else if (arr[i]==target){
           list.add(i) ;
        }
        return find_all_values(arr,target,i+1,list);
    }


}
