import java.util.ArrayList;

public class S6_Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);


        System.out.println("a" + 1);
        //this is same as after a few steps: "a" + "1".
        // integer will be converted to the Integer that will call tostring()

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal"+ 56);
        String ans  = 56 +" " +new ArrayList<>();
        System.out.println(ans);


    }
}
