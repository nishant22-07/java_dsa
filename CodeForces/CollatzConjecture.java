import java.util.*;

public class CollatzConjecture {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            long x = sc.nextLong();

            while(k-- > 0){
                if (x % 2 == 0 && (x - 1) % 3 == 0) {
                    long cand = (x - 1) / 3;
                    if (cand % 2 == 1) {
                        x = cand;
                        continue;
                    }
                }
                x = x * 2;
            }

            System.out.println(x);
        }
        sc.close();
    }
}
