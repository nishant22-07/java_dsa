//import java.util.Scanner;
//
//public class BinaryTree {
//
//    public BinaryTree(){
//
//    }
//
//
//    public static class Node{
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int value){
//            this.value = value;
//        }
//    }
//
//    private Node  root;
//
//    //Insert elements
//    public void populate(Scanner sc){
//        System.out.println("Enter the root node ");
//        int value = sc.nextInt();
//        root = new Node(value);
//        pupulate(sc,root);
//    }
//
//    private void pupulate(Scanner sc , Node node){
//        System.out.println("Do you want to insert left of " + node.value);
//        boolean left = sc.nextBoolean();
//        if (left){
//            System.out.println("Enter the value of  left of "+ node.value);
//            int value = sc.nextInt();
//            node.left = new Node(value);
//            populate(sc, node.left);
//        }
//
//        System.out.println("Do you want to insert right of " + node.value);
//        boolean right = sc.nextBoolean();
//        if (right){
//            System.out.println("Enter the value of  right of "+ node.value);
//            int value = sc.nextInt();
//            node.right = new Node(value);
//            populate(sc, node.right);
//        }
//    }
//
//    public void display(Node node, String indent ){
//        if(node!=null){
//            return;
//        }
//        System.out.println(indent + node.value);
//        display(node.left+indent + "\t");
//        display(node.right + indent + "\t" );
//    }
//
//
//}
