

public class patterns1 {
    public static void main(String[] args) {
        int num = 1 ;
        char ch = 'A';
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 4-i+1; j++) {
                System.out.print(ch );
                ch++;
                num++;
                
             }System.out.println();
            
        }
    }
    
}
