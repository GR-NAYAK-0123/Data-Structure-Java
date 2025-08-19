// import java.util.*;

public class Search_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static boolean search(Node root,int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
            return search(root.left, val);
        }
        else {
            return search(root.right, val);
        }
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println(search(root, 17));
    }
}
