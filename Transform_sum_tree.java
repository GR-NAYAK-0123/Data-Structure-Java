// import java.util.*;

public class Transform_sum_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int changeTo(Node root){
        if(root == null){
            return 0;
        }
        int leftVal = changeTo(root.left);
        int rightVal = changeTo(root.right);

        int selfVal = root.data;
        root.data = leftVal + rightVal;

        return selfVal + root.data;
    }
    public static void preOrder(Node root){ // for print
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        /*
                       1
                      / \
                     2   3
                    / \ / \
                   4  5 6  7
         
         
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        changeTo(root);
        preOrder(root);
    }
}
