import java.util.*;
public class CakeCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] arr1 = arr.clone();
            int sum = 0;
            while(m-->0){
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    max = Math.max(arr[i],max );

                }
                sum = sum + max;
                for (int i = 0; i <n ; i++) {
                    if (arr[i] == max){
                        arr[i] = 0;
                    }else {
                        arr[i] = arr[i] + arr1[i]  ;
                    }
                }

            }
            System.out.println( sum );

        }
        sc.close();
    }


}