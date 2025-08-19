import java.util.*;

// import org.w3c.dom.Node;


public class Top_view_Tree {
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
    static class Info{
        Node node;
        int val;

        public Info(Node node,int val){
            this.node = node;
            this.val = val;
        }
    }
    public static void topView(Node root){
        HashMap<Integer,Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();

        q.add(new Info(root,0));
        q.add(null);
        int min = 0;
        int max = 0;

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.val)){
                    map.put(curr.val,curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left,curr.val-1));
                    min = Math.min(min,curr.val-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right,curr.val+1));
                    max = Math.max(max,curr.val+1);
                }
            }
        }

        for(int i = min;i<=max;i++){
            System.out.println(map.get(i).data);
        }
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

        topView(root);
    }
}
