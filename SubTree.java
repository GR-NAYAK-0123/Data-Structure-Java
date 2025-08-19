// import java.util.*;

public class SubTree {
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
    public static boolean identical(Node root,Node subTree){
        if(root == null && subTree == null){
            return true;
        }
        else if(root == null || subTree == null){
            return false;
        }
        else if(root.data != subTree.data){
            return false;
        }
        if(!identical(root.left, subTree.left)){
            return false;
        }
        if(!identical(root.right, subTree.right)){
            return false;
        }

        return true;
    }
    public static boolean check(Node root,Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(identical(root,subroot)){
                return true;
            }
        }

        return check(root.left,subroot) || check(root.right,subroot);
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

        /*
                   2
                  / \
                 4   5
         */

         Node subroot = new Node(2);
         subroot.left = new Node(4);
         subroot.right = new Node(5);

         System.out.println(check(root, subroot));
    }
}
