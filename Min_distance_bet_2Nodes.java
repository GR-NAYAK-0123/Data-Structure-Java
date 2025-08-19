// import java.util.*;

public class Min_distance_bet_2Nodes {
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
    public static Node lca(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }

        return root;
    }
    public static int dist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdistance = dist(root.left, n);
        int rightdistance = dist(root.right,n);

        if(leftdistance == -1 && rightdistance == -1){
            return -1;
        }
        else if(leftdistance == -1){
            return rightdistance + 1;
        }
        else{
            return leftdistance + 1;
        }

    }
    public static int minDistance(Node root,int n1,int n2){
        Node lcaNode = lca(root, n1, n2);

        int leftdist = dist(lcaNode,n1);
        int rightdist = dist(lcaNode,n2);

        return leftdist + rightdist;
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

        int n1 = 4;
        int n2 = 6;

        System.out.println(minDistance(root, n1, n2));
    }
}
