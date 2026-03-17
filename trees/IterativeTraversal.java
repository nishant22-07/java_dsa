
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTraversal {

    public static class Node {
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

        System.out.println("Iterrative Pre Order Traversal : " + iterativePreOrderTraversal( root));
        System.out.println("Iterrative In Order Traversal : " + iterativeInOrderTraversal( root));
        System.out.println("Iterrative Post Order Traversal : " + iterativePostOrderTraversal( root));

    }

    public static List<Integer> iterativePreOrderTraversal(Node root){
        List<Integer> preOrder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root==null){
            return preOrder;
        }
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preOrder.add(root.data);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return  preOrder;
    }

    public static List<Integer> iterativeInOrderTraversal(Node root){
        List<Integer> inOrder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inOrder.add(node.data);
                node = node.right;

            }

        }
        return  inOrder;
    }

    public static List<Integer> iterativePostOrderTraversal(Node root){
        List<Integer> postOrder = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        if(root == null) {
            return postOrder;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }

        return postOrder;
    }
}
