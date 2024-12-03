import java.util.Scanner;

public class starpatterna {
    public static void main(String[] args) {
        System.out.println("enter any number to obtain inverted star pattern");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j =1; j<=n-i+1; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();

            
        }
    }
    
}
