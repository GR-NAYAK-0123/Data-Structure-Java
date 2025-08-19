// import java.util.*;

public class Valid_BST {
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
    public static boolean isValid(Node root, Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    public static void main(String args[]){
        Node root = new Node(-1);
        int nodes[] = {1,1,1};
        for(int i = 0;i<nodes.length;i++){
            construct(root, nodes[i]);
        }
        
        if(isValid(root, null, null)){
            System.out.println("Valid BST");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
