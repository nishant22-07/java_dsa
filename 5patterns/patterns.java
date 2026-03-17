public class patterns {
    public static void main(String[] args) {
        int n = 4 ;
        char ch ='A';
        int num= 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1  ; j++) {
                System.out.print(ch+" ");
                num++;
                ch++;
                
            }
          System.out.println();
        }
        
    }    
}
