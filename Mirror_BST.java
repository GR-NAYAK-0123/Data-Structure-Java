// import java.util.*;

public class Mirror_BST {
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
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node lefts = mirror(root.left);
        Node rights = mirror(root.right);

        root.left = rights;
        root.right = lefts;

        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(-1);
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        for(int i = 0;i<nodes.length;i++){
            construct(root, nodes[i]);
        }
        preOrder(root);
        System.out.println();
        Node finalRoot = mirror(root);
        preOrder(finalRoot);
    }
}
