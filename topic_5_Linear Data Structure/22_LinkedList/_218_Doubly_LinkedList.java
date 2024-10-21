/*
    Introduction to Doubly Linked List 
        it has data and address of 2 node (next and prev)

    Method are 
    // add     - addFirst       ,    addLast
    // remove  - removeFirst    , removeLast
    
 */

class Node2 {
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class _218_Doubly_LinkedList {
    // public static class Node2 {
    // int data ;
    // Node2 next;
    // Node2 prev;

    // Node2(int data ){
    // this.data = data;
    // this.next = null;
    // this.prev = null;
    // }
    // }

    private  int size;
    private  Node2 head;
    private  Node2 tail;

    public void addFirst(int data) {
        Node2 newNode = new Node2(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public int size(){
        return size ;
    }

    public int removeFirst() {
        
        if (head == null) {
            System.out.println("Doubly linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null ;
            size = 0 ;
            return val;
        }
        head = head.next ;
        head.prev = null ;
        size -- ; 
        return val ;
    }

    public void print() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " < - > ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data ){
        Node2 newNode = new Node2(data);
        if(size == 0 ){
            head = tail = newNode;
            size ++ ;
            return ;
        }
        size ++;
        tail.next = newNode ;
        newNode.prev = tail ;
        tail = newNode;
    }
    public int removeLast(){
        if(size == 0 ){
            System.out.println("Doubly linkedlist is empty");
            return Integer.MAX_VALUE;
        }
        if(size == 1 ){
            int val = tail.data;
            head = tail = null ;
            size -- ; 
            return val;
        }

        int val = tail.data;
        Node2 temp = tail.prev ;
        temp.next = null ;
        tail = temp ;
        return val ;
    }

    public static void main(String args[]) {
        _218_Doubly_LinkedList dll = new _218_Doubly_LinkedList();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        // 1 <-> 2 <-> 3 <-> 4 <-> 5

        dll.print();
        System.out.println("size : " + dll.size());
        
        System.out.println("removed item "+dll.removeFirst());
        dll.print();

        dll.addLast(6);
        dll.print();

        System.out.println( "removed item "+dll.removeLast());
        dll.print();
    }
}
