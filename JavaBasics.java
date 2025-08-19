import java.util.*;

public class JavaBasics {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // static class Info {
    //     int dia;
    //     int height;

    //     public Info(int dia,int height){
    //         this.dia = dia;
    //         this.height = height;
    //     }
    // }
    public static boolean search(Node root,int n){
        if(root == null){
            return false;
        }
        if(root.data == n){
            return true;
        } else if(root.data > n){
            return search(root.left, n);
        } else {
            return search(root.right, n);
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static Node newOne(Node node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
    public static Node delete(Node root,int n){
        if(root == null){
            return null;
        }
        if(root.data > n){
            root.left = delete(root.left, n);
        } else if(root.data < n){
            root.right = delete(root.right, n);
        } else if(root.data == n){
            if(root.left == null && root.right == null){
                return null;
            } else if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            } else if(root.left != null && root.right != null){
                Node Is = newOne(root.right);
                root.data = Is.data;
                root.right = delete(root.right, Is.data);
            }
        }
        return root;
    }
    public static void range(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            range(root.left, k1, k2);
            System.out.print(root.data + " ");
            range(root.right, k1, k2);
        } else if(root.data > k2){
            range(root.left, k1, k2);
        } else if(root.data < k1){
            range(root.right, k1, k2);
        }
    }
    static List<List<Integer>> main = new ArrayList<>();
    // public static void print(Node root,List<Integer> list){
    //     if(root == null){
    //         return;
    //     }
    //     list.add(root.data);
    //     print(root.left, list);
    //     print(root.right, list);
    //     if(root.left == null && root.right == null){
    //         main.add(new ArrayList<>(list));
    //     }
    //     //main.add(new ArrayList<>(list));
    //     list.remove(list.size()-1);
    // }
    public static void mirror(Node root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);;
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;
    }
    public static Node balanced(Node root,int arr[],int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = si + (ei - si)/2;
        if(root == null){
            // Node node = new Node(arr[mid]);
            root = new Node(arr[mid]);
            root.left = balanced(root.left, arr, si, mid-1);
            root.right = balanced(root.right, arr, mid+1, ei);
        }
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
    public static void inOrder(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static Node createBalance(List<Integer> list,int si,int ei){
        if(si > ei){
            return null;
        }
        int mid = si + (ei-si)/2;
        Node root = new Node(list.get(mid));
        root.left = createBalance(list, si, mid-1);
        root.right = createBalance(list, mid+1, ei);
        return root;
    }
    public static boolean valid(Node root,int min,int max){
        if(root == null){
            return true;
        } else if(root.data > max || root.data < min){
            return false;
        } 
        if(valid(root.left, min, root.data) && valid(root.right, root.data, max)){
            return true;
        }
        return false;
    }
    static class Info{
        boolean isBst;
        int size;

        public Info(boolean isBst,int size){
            this.isBst = isBst;
            this.size = size;
        }
    }
    static int maxS = -1;
    public static Info largeBST(Node root,long min,long max){
        if(root == null){
            return new Info(true,0);
        } else if(root.data <= min || root.data >= max){
            return new Info(false, 0);
        }
        Info leftInfo = largeBST(root.left, min, root.data);
        Info rightInfo = largeBST(root.right, root.data, max);
        if(leftInfo.isBst && rightInfo.isBst){
            maxS = Math.max(maxS,leftInfo.size + rightInfo.size + 1);
            return new Info(true, leftInfo.size + rightInfo.size + 1);
        }
        return new Info(false, 0);
    }
    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static boolean isSort(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return isSort(arr, idx+1);
    }
    public static int last(int arr[],int idx,int target){
        if(idx == arr.length){
            return -1;
        }
        int next = last(arr, idx+1, target);
        if(next == -1 && arr[idx] == target){
            return idx;
        } else {
            return next;
        }
    }
    public static int power(int num, int n){
        if(n == 1){
            return num;
        }
        int half = power(num,n/2);
        if(n % 2 == 0){
            return half * half;
        } else {
            return half * half * num;
        }
    }
    public static String res = "";
    public static void remove(String str,int idx){
        if(idx == str.length()){
            return;
        }
        Character ch = str.charAt(idx);
        if(!res.contains(ch.toString())){
            res+=ch;
        }
        remove(str, idx+1);
    }
    public static void pushEnd(Stack<Integer> s , int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int num = s.pop();
        pushEnd(s, val);
        s.push(num);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        reverse(s);
        pushEnd(s, val);
    }
    public static int tower(int n, int from, int to, int aux){
        if(n == 1){
            return 1;
        }
        int count = tower(n-1, from, aux, to);
        count += 1;
        count += tower(n-1, aux, to, from);
        return count;
    }
    public static void main(String args[]){
        // char ch = 'a';
        System.out.println((char)(25 + 'a'));
      //System.out.println(tower(4,0,0,0));
    //     Node root = new Node(50);
    //     root.left = new Node(30);
    //     root.left.left = new Node(5);
    //     root.left.right = new Node(20);
    //     root.right = new Node(60);
    //     root.right.left = new Node(55);
    //     root.right.right = new Node(70);
    //     root.right.right.left = new Node(65);
    //     root.right.right.right = new Node(80);
    //    largeBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    //    System.out.println(maxS);
    }
}