public class R12_ispalindrom {
    public static void main(String[] args) {
       boolean palindrom =  isPalindrom(321);
       System.out.println(palindrom);
    }
    static int sum = 0;
    static void reverseNum1(int n){
        if(n==0){
            return ;
        }
        int rem = (n%10);
        sum = sum*10 + rem;
        reverseNum1(n/10);
    }

    static int revnum2(int n){
        //sometimes you might need some additional variable in arguments
        //in that case make another function
        int digits = (int)(Math.log10(n))+1;
         return helper(n , digits);
    }
    private static int helper(int n , int digits ){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean isPalindrom(int n){
        if(n==revnum2(n)){
            return true;
        }
        return false;
    }


}
