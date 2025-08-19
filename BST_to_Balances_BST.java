import java.util.*;

public class BST_to_Balances_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node create(List<Integer> list,int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(list.get(mid));
        root.left = create(list, si, mid-1);
        root.right = create(list, mid+1, ei);

        return root;
    }
    public static void inOrder(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
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
        List<Integer> list = new ArrayList<>();
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        inOrder(root, list);
        Node newRoot = create(list, 0, list.size()-1);
        inOrder(newRoot);
    }
}
