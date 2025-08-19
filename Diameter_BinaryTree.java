// import java.util.*;

public class Diameter_BinaryTree {
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter1(root.left);
        int rightDiam = diameter1(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int selfDiam = leftHeight + rightHeight + 1;
        return Math.max(Math.max(leftDiam,rightDiam),selfDiam);
    }

    static class Info{
        int diam;
        int height;

        public Info(int diam,int height){
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftdiam = diameter(root.left);
        Info rightdiam = diameter(root.right);

        int finaldiam = Math.max(Math.max(leftdiam.diam,rightdiam.diam),leftdiam.height + rightdiam.height + 1);
        int height = Math.max(leftdiam.height,rightdiam.height) + 1;

        return new Info(finaldiam,height);
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
        //root.right.right.right = new Node(8);

        //System.out.println("The diameter of the above tree is " + diameter1(root));
        System.out.println(diameter(root).diam);
    }
}
