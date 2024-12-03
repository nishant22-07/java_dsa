import java.util.Scanner;

public class charracterpattern {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    char ch = 'A';
    // outer loop
    for(int i=1 ;i<=n;i++){
        //inner loop
        for (int j = 1; j<=i; j++) {
            System.out.print(ch);
            ch++;
            
        }System.out.println();
    }

    
}
}
