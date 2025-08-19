import java.util.*;

public class Level_Order_BinaryTree {
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
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node temp = new Node(nodes[idx]);
            temp.left = buildTree(nodes);
            temp.right = buildTree(nodes);

            return temp;
        }
    }
    public static void levelOrder(Node root){
        if(root == null){
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    System.out.println();
                    q.add(null);
                }
            }
            else{
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                System.out.print(curr.data + " ");
            }
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        levelOrder(root);
    }
}
