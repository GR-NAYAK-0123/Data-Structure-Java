//import java.util.*;

public class Sorted_Array_to_Balanced_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }
    public static Node contruct(int values[],int si,int ei){
        if(si > ei){
            return null;
        }
        if(si == ei){
            return new Node(values[si]);
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(values[mid]);
        root.left = contruct(values, si, mid-1);
        root.right = contruct(values, mid+1, ei);
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
        //Node root = null;
        int values[] = {3,5,6,8,10,11,12};
        Node root1 = contruct(values, 0, values.length-1);
        System.out.println(root1.data);
        inOrder(root1);
    }
}
