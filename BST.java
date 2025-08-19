//import java.util.*;

public class BST {
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
    public static void construct(Node root,int val){
        Node temp = new Node(val);

        if(root.data < 0){
            root.data= temp.data;
            return;
        }
        if(root.data > temp.data){
            if(root.left == null){
                root.left = temp;
                return;
            }
            else{
            construct(root.left, val);
            }
        }
        else{
            if(root.right == null){
                root.right = temp;
                return;
            }
            else{
                construct(root.right, val);
            }
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        //Node root = new Node(-1);
        Node root = null;
        int value[] = {5,1,3,4,2,7};
        for(int i = 0;i<value.length;i++){
            root = insert(root, value[i]);
        }
        inOrder(root);
    }
}
