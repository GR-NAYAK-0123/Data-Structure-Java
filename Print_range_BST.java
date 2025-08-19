// import java.util.*;

public class Print_range_BST {
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
            root.data = temp.data;
            return;
        }
        if(root.data < val){
            if(root.right == null){
                root.right = temp;
                return;
            }
            else{
                construct(root.right, val);
            }
        }
        else{
            if(root.left == null){
                root.left = temp;
                return;
            }
            else{
                construct(root.left, val);
            }
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void printRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printRange(root.right, k1, k2);
        }
        else if(root.data > k2){
            printRange(root.left, k1, k2);
        }
    }
    public static void main(String args[]){
        Node root = new Node(-1);
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        for(int i = 0;i<nodes.length;i++){
            construct(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();

        printRange(root, -1, 3);
    }
}
