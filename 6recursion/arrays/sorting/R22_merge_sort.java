package arrays.sorting;

import java.util.Arrays;

public class R22_merge_sort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        int[] arr2 = mergeSort(arr);
        System.out.println(Arrays.toString(arr2));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }


    static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< first.length && j < second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
                k++;
            }else {
                mix[k] = second[j];
                j++;
                k++;
            }
        }
        //it is possible that one of the array is not completed
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k] = second[j];
            j++;
            k++;

        }
        return mix;
    }
}
