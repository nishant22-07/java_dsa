import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a6_arrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get item any index
        for (int i = 0; i <5; i++) {
            System.out.println(list.get(i)); //pass index here , list[index] syntax will not work here

        }
        System.out.println();


//        list.add(87);
//        list.add(8);
//        list.add(7);
//        list.add(287);
//        list.add(837);
//        list.add(874);
//        list.add(872);
//        list.add(874);
//        list.add(876);
//        list.add(879);
//        list.add(875);
//        list.add(8744);
//        list.add(2);
//        list.add(817);
//        list.add(87);
//        list.add(8);
//        list.add(7);
//        list.add(287);
//        list.add(837);
//        list.add(874);
//        list.add(872);
//        list.add(874);
//        list.add(876);
//        list.add(879);
//        list.add(875);
//        list.add(8744);
//        list.add(2);
//        list.add(817);
//        System.out.println(list);
//        list.set(0,22);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//
//        System.out.println(list.contains(821));
//        System.out.println(list.contains(81));
//        System.out.println(list.contains(817));


    }
}
