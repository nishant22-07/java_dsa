public class R4_nthFinonacciNo {
    public static void main(String[] args) {
        int ans  = 7 ;
        System.out.println(fibonacci(ans));

    }
    static int fibonacci(int n){
        if(n < 2){
            return n ;
        }
       return fibonacci(n-1) + fibonacci(n-2);

    }
}
