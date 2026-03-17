
import java.util.*;
public class Solution1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1 ; i<=m ;i++){
            if(i%n==0){
                sum1 = sum1 + i;
            }else{
                sum2 = sum2 + i;
            }
        }
        System.out.println(sum2-sum1);


    }
}
