import java.util.*;

// import org.w3c.dom.Node;

public class Print_root_to_leaf_path {
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
    public static void printPath(List<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }
    public static void printRoot2leaf(Node root,List<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        Node root = new Node(-1);
        int nodes[] = {8,5,3,1,4,6,10,11,14};
        for(int i = 0;i<nodes.length;i++){
            construct(root, nodes[i]);
        }
        List<Integer> path = new ArrayList<>();
        printRoot2leaf(root, path);
    }
}
