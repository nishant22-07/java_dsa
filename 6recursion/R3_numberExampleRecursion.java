public class R3_numberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // Base Condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        print(n+1);
    }
}
