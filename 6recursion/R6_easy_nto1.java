public class R6_easy_nto1 {
    public static void main(String[] args) {
        fun(5);
        funrev(1);
    }
    static void fun(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        funrev(n+1);
    }

}
