import java.util.*;

public class Merge_2_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void getInOrder(Node root, List<Integer> list){
        if(root == null){
            return;
        }
        getInOrder(root.left, list);
        list.add(root.data);
        getInOrder(root.right, list);
    }
    public static Node construct(List<Integer> list,int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(list.get(mid));
        root.left = construct(list, si, mid-1);
        root.right = construct(list, mid+1, ei);

        return root;
    }
    public static Node merge(Node root1, Node root2){
        //step-1
        List<Integer> list1 = new ArrayList<>();
        getInOrder(root1, list1);

        //step-2
        List<Integer> list2 = new ArrayList<>();
        getInOrder(root2, list2);

        //step-3
        //merge these two lists into one list in ascending order
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) <= list2.get(j)){
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            result.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            result.add(list2.get(j));
            j++;
        }
        return construct(result, 0, result.size()-1);
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
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node answer = merge(root1, root2);
        preOrder(answer);
    }
}
