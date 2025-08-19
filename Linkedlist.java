public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Step-1 = Create a Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step - 2 = newNode next = head
        newNode.next = head;

        //Step - 3 = head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
    public void addAny(int idx,int data){
        if(idx == 0){
           addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        while(idx != 1){
            temp = temp.next;
            idx--;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteLast(){
        if(size == 0){
            System.out.println("Linkedlist is empty");
            return;
        }
        else if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while((temp.next).next != null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public void deleteFirst(){
        if(size == 0){
            System.out.println("The linkedlist is empty");
            return;
        }
        else if(size == 1){
            head = tail = null;
        }
        Node newNode = head;
        head = newNode.next;
        size--;

    }
    public int itrSearch(int key){
        if(head == null){
            return -1;
        }
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    public int recSearch(Node head,int idx,int key){
        if(head == null){
            //System.out.println("The key is not found");
            return -1;
        }
        if(head.data == key){
            //System.out.println("The key is present at " + idx);
            return idx;
        }
        int index = recSearch(head.next, idx, key);
        if(index != -1){
            return index+1;
        }
        else{
            return -1;
        }
    }
    public void reverse(Node head){
        Node temp1 = head;
        Node temp2 = null;
        while(head != null){
            temp1 = temp1.next;
            head.next = temp2;
            temp2 = head;
            head = temp1;
        }
        head = temp2;
        print(head);
    }
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMiddle(head);
        Node temp = null;
        Node temp1 = mid;
        
        while(mid != null){
            temp1 = temp1.next;
            mid.next = temp;
            temp = mid;
            mid = temp1;
        }
        Node right = temp;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public void delNthFrom_end(int pos){
        int idx = 0;
        if(size - idx == pos){
            head = head.next;
            return;
        }
        Node temp1 = head;
        Node temp2 = head;
        while((size - idx) != pos){
            temp2 = temp1;
            temp1 = temp1.next;
            idx++;
        }
        temp2.next = temp1.next;
        print(head);
    }
    public void print(Node head){
        if(head == null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        //ll.addLast(1);
        //ll.addAny(4, 5);
        // ll.deleteFirst();
        // ll.deleteLast();
        //Node temp = head;
        ll.print(head);
        //System.out.println(ll.size);
        //System.out.println(ll.itrSearch(5));
        //System.out.println(ll.recSearch(head, 0, 3));
        //ll.reverse(head);
        // ll.delNthFrom_end(5);
        // ll.print(head);
        System.out.println(ll.checkPalindrome(head));
    }
}
