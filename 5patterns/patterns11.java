public class patterns11 {
    // Hollow Rectangle
    public static void hollow_rectangle(int rows,int colunmns){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colunmns; j++) {
                if (i==1||i==rows||j==1||j==colunmns) {
                    System.out.print(" * ");

                    
                }else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
    //Inverted Half Pyramid
    public static void Inverted_half_pyramid(int rows){
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=rows-i+1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
                
            }System.out.println();
        }
    }
    
    
    //Inverted Half Pyramid With Numbers
    public static void in_half_pyramid_with_numbers(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=rows-i+1; j++) {
                System.out.print(" "+j+" ");
                
            }System.out.println();
       }
    }
    
    //floyd's triangle
    public static void floyd_triangle(int rows){
        int num = 1;  
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  "+num+" ");
                num++;
                
            }System.out.println();
         }
    }
    
    //0-1 Triangle
    public static void trianle_0_1(int rows){
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(" "+1+" ");
                    
                } else {
                    System.out.print(" "+0+" ");
                    
                }
                }System.out.println();
            }
        }
    
    

    public static void main(String[] args) {
        hollow_rectangle(4,5);
        System.out.println();
        Inverted_half_pyramid(6);
        System.out.println();
        in_half_pyramid_with_numbers(5);
        System.out.println();
        floyd_triangle(5);
        trianle_0_1(5);
            
        }
    }

