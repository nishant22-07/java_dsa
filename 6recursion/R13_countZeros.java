public class R13_countZeros {
    public static void main(String[] args) {
        int cz =countz(1020304);
        System.out.println(cz);

    }
    static int countz(int n){
       return helper(n,0);

    }
    private static int helper(int n , int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10 , count+1);
        }
        return helper(n/10,count);


    }
}
