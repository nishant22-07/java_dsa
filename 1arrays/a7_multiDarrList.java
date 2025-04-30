import java.util.ArrayList;
import java.util.Scanner;


public class a7_multiDarrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //INITIALIZATION
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        System.out.println("enter no of rows :");
        int rows =sc.nextInt();
        System.out.println("enter no of columns");
        int columns = sc.nextInt();

        //Add Elements
        System.out.println("enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                list.get(i).add(sc.nextInt());
            }

        }

        // Printing in grid format
        System.out.println("Here's your 2D ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println(); // new line after each row
        }

        sc.close();
    }
}
