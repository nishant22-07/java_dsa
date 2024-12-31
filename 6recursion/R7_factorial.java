public class R7_factorial {
    public static void main(String[] args) {
        int factorial = fact(9);
        System.out.println(factorial);
    }
    static int fact(int n){
        if (n==1){
            return 1 ;
        }
        return n*fact(n-1);
    }
}
