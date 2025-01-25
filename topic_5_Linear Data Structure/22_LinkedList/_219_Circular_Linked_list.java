/*
    Introduction to circular linked list 
        Circular linked list is a linked link in which all nodes form circle in this initial and last node is linked to each other

    It has mainly two types 

    single node is      - > | data | next | ->
    doubly node is      - > | prev | data | next | ->

    1. Single Circular linked list      ->node1 -> node2 ->node3 -> node4-> node1
    2. Doubly Circular linked list      node 4 <->node1 <-> node2 <->node3 <-> node4 <-> node1

    operation perform on the linked list 
    1 . Insertion - addEmpty , addFront , addLast , addMiddleAfter
    2 . Deletion  - delete
    3 . Traverse 


 */
public class _219_Circular_Linked_list {

    class Node{

        int data ;
        Node next ;
        Node(int data ){
            this.data = data;
        }
    }
    int size ;
    Node head ;
    Node tail ;

    //addEmpty 
    void addToEmpty(int data ){
        if(size != 0 ){
            return ;
        }
        size++;
        Node newNode = new Node(data);
        head = tail = newNode ;
    }
    //addFront 
    void addFront(int data){
        if(size == 0 ){
            addToEmpty(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = tail.next = newNode ; 
        size++;
    }
    //addLast 
    void addLast(int data){
        if(size == 0 ){
            addToEmpty(data);
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode ;
        size++;
    }
    // add node after the i node 
    void addAfter(int target , int data ){
        int i = target ;

        if( i == 0 || head == null){
            System.out.println("Enter an valid index or linked list is empty ");
            return ;
        }
        if( i == 1 ){
            addFront(data);
            return ;
        }
        if( i == size){
            addLast(data);
            return ;
        }

        //add in the middle node  
        i = 1 ; 
        Node temp = head ;
        while( i < target ){
            temp = temp.next ;
            i++;
        }
        Node tempNext = temp.next ;
        Node newNode = new Node (data);
        temp.next = newNode ;
        newNode.next = tempNext; 
        size++;

    }
    // remove the node from circular linked list 
    void deleteFirst(){
        if(head == null){
            return ;
        }
        if(size == 1 ){
            head = tail = null ;
            size --;
            return ;
        }
        head = head.next;
        tail.next = head;
        size--;
    }
    void deleteLast(){
        if(head == null){
            return;
        }
        if(head == tail ){
            size--;
            tail = head = null ;
            return ;
        }
        int i = 1 ;
        Node temp = head;
        while( i != size - 1){
            temp = temp.next ;
            i++;
        }
        size--;
        temp.next = head;

    }
    // delete the ith node 
    void deleteNode(int target){
        // size == 0 empty node 
        if( target == 0 || target > size ){
            System.out.println("Index start from 1 or enter valid index ");
            return ;
        }
        else if(target == 1 ){
            deleteFirst();
            return ;
        }
        else if (size == 1 || target == size ){
            deleteLast();
        }

        int i = 1;
        Node temp = head ;
        while(i != target - 1 ){
            temp = temp.next;
            i++;
        }

        if(temp.next.next != null){
            temp.next = temp.next.next; 
        }else{
            temp.next = head;
        }
        size --;
        
    }
    //traverse (print) function for circular linked list 
    void traverse(){
        int i = size ;
        Node temp = head ;
        if(head == null){
            System.out.println("null LinkedList ");
            return ;
        }
        while(i > 0 ){
        
           System.out.print(temp.data + " -> ");
           temp = temp.next;
           i--;
        }
        System.out.println("");
    }
    
    public static void main(String args[]){
        _219_Circular_Linked_list circularLL = new _219_Circular_Linked_list();


        circularLL.addToEmpty(43);
        circularLL.addFront(3);
        circularLL.addLast(2);
        System.out.println(circularLL.size);
        circularLL.traverse();

        // addAfter
        circularLL.addAfter(1 , 54);
        circularLL.traverse();
        circularLL.addAfter(4 , 4);
        circularLL.traverse();

        // delete node 
        circularLL.deleteNode(1);
        circularLL.deleteNode(3);
        circularLL.traverse();


    }
}
