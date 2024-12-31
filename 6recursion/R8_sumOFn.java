public class R8_sumOFn {
    public static void main(String[] args) {
        int SUM = sum(5);
        System.out.println(SUM);
    }
    static int sum(int n){
        if (n==1){
            return 1 ;
        }
        return n+sum(n-1);
    }

}
