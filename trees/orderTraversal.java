import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class orderTraversal {
    private static class Node {
        int data;
        Node left;
        Node right;
        public Node(int val){
            this.data = val;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("PreOrder Traversal : ");
        preOrderTraversal(root);

        System.out.println();
        System.out.print("InOrder Traversal : ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        postOrderTraversal(root);

        System.out.println();
        System.out.print("Level Order Traversal / BFS : " + levelOrderTraversal(root));

    }

    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data +" ");
    }

    public static List<List<Integer>> levelOrderTraversal(Node root){
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root==null){
            return wrapList;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int qsize = queue.size();
            List<Integer> subList = new ArrayList<>( );

            for (int i = 0; i < qsize; i++) {
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }

                subList.add(queue.poll().data);


            }
            wrapList.add((subList));

        }

        return wrapList;
    }
}



