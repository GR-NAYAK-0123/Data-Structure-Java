// import java.util.*;

public class Delete_Node_BST {
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
    public static void construct(Node root,int value){
        Node temp = new Node(value);
        if(root.data < 0){
            root.data = temp.data;
            return;
        }
        if(root.data > temp.data){
            if(root.left == null){
                root.left = temp;
                return;
            }
            else{
                construct(root.left, temp.data);
            }
        }
        else{
            if(root.right == null){
                root.right = temp;
                return;
            }
            else{
                construct(root.right, temp.data);
            }
        }
    }
    public static Node delete(Node root,int val){
        if(root.data > val){
            root.left =  delete(root.left,val);
        }
        else if(root.data < val){
            root.right =  delete(root.right, val);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node is = findInOrderSuccesor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }
    public static Node findInOrderSuccesor(Node root){
        while(root.left != null){
            root = root.left;
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
        Node root = new Node(-1);
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        for(int i = 0;i<nodes.length;i++){
            construct(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        int val = 5;
        delete(root, val);
        inOrder(root);
    }
}
