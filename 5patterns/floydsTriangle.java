import java.util.Scanner;
public class floydsTriangle {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        System.out.println("FLOYD TRINGLE:");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+num+" ");
                num++;
                
            }System.out.println();  
        }
    }
    
}
