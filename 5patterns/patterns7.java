//parallelogram Or Hollow parallelogram
public class patterns7 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=rows-i+1; j++) {
                System.out.print("   ");
                
            }
            for (int j = 1; j <= rows; j++) {
                //System.out.print("*");
                if(i==1||i==rows||j==1||j==rows){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }System.out.println();
            
        }
    }
    
}
