public class R10_productDigits {
    public static void main(String[] args) {
        System.out.println(product_digits(65650));
    }
    static int product_digits(int n){
        if(n%10==n){
            return n;

        }
        int reminder = n%10;
        return reminder * product_digits(n/10);
    }
}
