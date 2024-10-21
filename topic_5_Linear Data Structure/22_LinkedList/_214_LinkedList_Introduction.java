/*
    Introduction to linkedlist
    
    It is  a Linear data Structure , in which the its has data and referenced variable which points to 
        next node

        NODE 1                      NODE 2                      NODE 3 
        [ data ,next ]    --->      [data,next]      --->       [data , null];

    It is represented using the class which has blueprint to create mutiple objects 

    we use method to perform operations 
    1. add()    -   addFirst()
    2. remove() 
    3. print()  
    4. search() 
                            Time complexity 
    size()                  O ( 1 )
    addFirst()              O ( 1 )
    addLast()               O ( n )
    print()                 O ( n )
    add(idx , data)         O ( n )
    removeFirst()           O ( 1 )
    removeLast()            O ( n )

    
    /* NOTE : 
        In java Garbage collector is used to free up the resources which will be not in use anymore,
            that's why if we remove all the path to reach at a node which we want to delete and java garbage 
            collector will free up the resources 
    */

class Node{
    
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
// Linked List is made from the multiple node 
public class _214_LinkedList_Introduction {
    // public static class Node{
    
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    
    public static Node head;
    public static Node tail;    
    public static int size;

    //return the size of linkedlist
    public int size(){
        return size;
    }

    // addFist() -  Time complexity - O(1) 
    public void addFirst(int data){
        //step 1 - create new node 
        Node newNode = new Node(data);
        size++;     //incrememt the size 
        if(head == null ){
            head = tail = newNode ;
            return ;                                    // We will get error for self reference 
        }

        //step 2 - point it to next node 
        newNode.next = head ;   // link 

        //step 3 - point head to newnode
        head = newNode ;
    }
    // time complexity - O(n)
    public void addLast(int data){
        //step 1 : create a newNode 
        Node newNode = new Node(data);
        size++;
        if(head == null ){
            head = tail = newNode;
            return ;
        }

        //step 2 : tail.next = newnode 
        tail.next = newNode;

        //step 3 : move tail to newNode 

        tail = newNode ; 
    }

    //time complexity - O(n)
    public void print(){
        
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        //declare new temp variable 
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " -> ");   //print the data 
            temp = temp.next;       // assign the next value to temp
        }
        System.out.println("null");
    }
    // time complexity - O(n)
    public void  add( int idx , int data){
        //variable declare 
        Node newNode = new Node(data);
        //find the location of idx - 1 

        //special case we have to change the head to in this case 
        if(idx == 0 ){
            addFirst(data);
            return ;
        }
        size++;
        int i = 0 ; 
        Node temp = head ;
        while(i < idx - 1 ){    // previous index to insert the value at index 
            temp = temp.next;
            i++;
        }
        //swap the value 
        newNode.next = temp.next ;
        temp.next = newNode;

    }

    /*
        time complexity - O(1)
        In java Garbage collector is used to free up the resources which will be not in use anymore,
            that's why if we remove all the path to reach at a node which we want to delete and java garbage 
            collector will free up the resources 
     */ 

    public int removeFirst(){
        //special case for handling head and tail of linkedlist
        if(size == 0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1 ){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        size--;     // remove and return the first value of linkedlist
        int val = head.data ;
        head = head.next ;
        return val;

    }
    // time complexity - O(n)
    public int removeLast(){
        if(size == 0 ){
            System.out.println("LL is empty");
        }else if (size == 1 ){
            int val = head.data;
            size = 0 ;
            return val;
        }
        // previous = size - 2 ;
        Node prev = head;
        for(int i = 0 ; i < size - 2 ; i ++){
            prev = prev.next;
        }
        size--;
        int val = prev.next.data;   //tail.data
        prev.next = null;
        tail = prev;    //move tail pointer 
        return val;
    }

    // Time complexity - O(n)
    public int itrSearch( int target ){
        //declare the temp and i variable to find the target
        Node temp = head ;
        int i = 0 ;

        while(temp != null){
            if(temp.data == target ){
                return i ; 
            }
            temp = temp.next;
            i++;
        }

        return -1 ; // we don't find the target 
    }

    //recursive search in Linkedlist
        // Time complexity - O(n)
        // space complexity - O(n)

    public int helper(int target , Node head){
        //base case 
        if(head == null ){
            return -1 ;
        }
        if(head.data == target){
            return 0;
        }
        head = head.next;   //move the next variable
        int val = helper(target, head);
        
        if(val == -1 ){
            return -1 ;
        }
        return val + 1;

    }
    
    public int recSearch(int target){       
        // we are using the helper function 
        Node temp = head ;
        return helper(target, temp);
    }

    //  Time complexity - O(n)         1 -> 2 -> 3 -> 4 -> null
    //  space complexity - O(1)     null -> 4 -> 3 -> 2 -> 1 
    public void reverse(){
        // declare the Node varaible and initialize them except for Next 
        Node prev  = null ; 
        Node curr = head ; 
        Node Next ; 

        while(curr != null){
            Next = curr.next;   //  Next initialize in this step 
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev ;           //point the head to correct place 

    }
    public void removeNnodeFromEnd(int n){
        //calculate the size of linkedlist
        int size = 0 ;
        Node temp = head ;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        //base conditions 
        if(size == n ){
            head = head.next ;
            return ;
        }if(n > size ){
            return ;
        }
        //go to n - 1 node 
        Node prev = head;
        for(int i = 0 ; i < size - n - 1  ; i++ ){
            prev = prev.next;
        }
        //get the prev location 
        Node curr = prev.next;
        prev.next = curr.next;      //  or  prev.next = prev.next.next ;
        curr.next = null;       //n th node link is broken so java garbage collector 
                                // will delete this (un-nessary step would done automatically if i don't write )

    }

    // Slow - Fast Approach 
    public Node findMinNode(){
        Node slow = head ;
        Node fast = head ;
        while( fast != null && fast.next != null ){
            slow = slow.next ;          //+1
            fast = fast.next.next ;     //+2
        }
        return slow ;   //slow is midNode 
    }

    public boolean checkPalindrome(){
        if( head == null || head.next == null ){
            return false;
        }
        //find the mid point using the fast and slow approach 
            Node mid = findMinNode();

        // reverse the 2nd half array 
        Node curr = mid ;
        Node prev = null;
        while(curr != null){
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        //check left half and right half 
        Node right = prev ; // right half head 
        Node left = head ;
            
        while(left != null && right != null){
            if(right.data != left.data){
                return false ;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public void clear(){
        head = null;    //delete the node 
    }

    //  is there cycle in the linkedlist
    // Floyd's Cycle Finding Algorithm 
    // Time complexity - O(n)
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;       //+1 
            fast = fast.next.next;  //+2
            if(fast == slow ){
                return true ;   //cycle exists
            }
        }
        return false ;      //cycle does't exists
    }

    // Remove the cycle form the linkedlist 
    // Time complexity - O(n)
    // works Only if the head cannot be our start of cycle (edge case : ->1 -> 2 -> 3 - > 1 )
    public void removeCycle(){
        // Step 1 - detect the cycle present 
        // using the fast - slow pointer floyd's cycle finding algorithm
        Node slow = head ;
        Node fast = head ;
        boolean cyclePresent = false;
        while(fast != null && fast.next != null ){
            slow = slow.next;           // + 1
            fast = fast.next.next ;     // + 2 
            if(fast == slow ){
                cyclePresent = true;
                break;
            }
        }
        //we have fast and slow node value 
        if(cyclePresent == false ){
            return ;    //if no cycle is present in the then return 
        }
        // Step 2 - check the last node (or meeting point )
        slow = head;
        Node prev = null;   
        while( fast != slow  ){
            prev = fast;        // last location before fast == slow
            slow = slow.next;   // +1
            fast = fast.next;   // +1
        }
        // Step 3 - change the last node to null 
        prev.next = null;
    }

    public static void main(String[] args) {

        _214_LinkedList_Introduction ll = new _214_LinkedList_Introduction();

        //use method to add node
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);


        ll.print();     // 1 -> 2 -> 9 - > 3 -> 4 
        System.out.println("Size of the Linkedlist is : "+ll.size());


        ll.removeFirst();
        ll.print();
        System.out.println("Size of the Linkedlist is : "+ll.size());

        ll.removeLast();
        ll.print();             //2 -> 9 - > 3
        System.out.println("Size of the Linkedlist is : "+ ll.size());


        // Iterative Search in the linked list O(n)
        System.out.println(" Iterative Search");
        System.out.println(ll.itrSearch(3) + " ");
        System.out.println(ll.itrSearch(34) + " ");

        //recursive search in the linked list
        System.out.println(" Recursive Search");
        System.out.println(ll.recSearch(3) + " ");
        System.out.println(ll.recSearch(34) + " ");


        //Reverse the LinkedList
        ll.reverse();
        ll.print();


        // remove n th node from the end 
        ll.removeNnodeFromEnd(2);
        ll.print();
        

        //check Palindrome in the linked list 
        ll.clear();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Is linked list is palindrome : "+ll.checkPalindrome()+"\n");


        // check if there exits cycle in the linked list or not 
        ll.clear();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp ;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        
        
        
        //last node next in point to head therefore cycle exists
        // tail.next = head ;  // 1 -> 2 -> 3 -> 2 ( cycle )

        System.out.println("Is cycle exits in linkedlist : "+ isCycle());
        

        //remove the cycle from the code 
        ll.removeCycle();
        ll.print();
        System.out.println("Is cycle exits in linkedlist : "+ isCycle());



    }
}
