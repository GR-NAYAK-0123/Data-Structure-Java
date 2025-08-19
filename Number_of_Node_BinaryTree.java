// import java.util.*;

public class Number_of_Node_BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int numberOfNode(Node root){
        if(root == null){
            return 0;
        }
        int l = numberOfNode(root.left);
        int r = numberOfNode(root.right);

        return (l + r) + 1;
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

        System.out.println("The number of node in the above tree is " + numberOfNode(root));
    }
}
