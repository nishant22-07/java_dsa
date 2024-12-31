public class R9_sumOfdigits {
    public static void main(String[] args) {
        System.out.println(sum_digits(1342));
    }
    static int sum_digits(int n){
        if(n==0){
            return 0;

        }
        int reminder = n%10;
        return reminder + sum_digits(n/10);
    }
}
