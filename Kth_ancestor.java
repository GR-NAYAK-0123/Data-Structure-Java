import java.util.*;

public class Kth_ancestor {
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
    public static boolean getpath(Node root,int n,List<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getpath(root.left, n, path);
        boolean foundRight = getpath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node kthAncestor(Node root,int n,int k){
        List<Node> path = new ArrayList<>();

        getpath(root,n,path);

        int i = 0;
        for(;i<path.size();i++){
            if(path.size() - i - 1 == k){
                break;
            }
        }
        return path.get(i);
    }
    public static int K_ancestor(Node root,int n,int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdist = K_ancestor(root.left, n, k);
        int rightdist = K_ancestor(root.right, n, k);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }

        int max = Math.max(leftdist,rightdist);
        if((max + 1) == k){
            System.out.println("Ancestor is " + root.data);
        }
        return max + 1;
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

        int n = 6;
        int k = 1;

        K_ancestor(root, n, k);
    }
}
