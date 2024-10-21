/*
    Odd Even Linked List
    
    We have a Linked List of integers, write a function to modify the linked list such that all even
    numbers appear before all the odd numbers in the modified linkedlist.
    Also,keep the order of even and odd numbers same.
    
    Sample Input 1: 8->12->10->5->4->1->6->NULL
    Sample Output 1: 8->12->10->4->6->5->1->NULL
    
    Sample Input 2: 1->3->5->7->NULL
    Sample Output 2: 1->3->5->7->NULL

    Approach -

    1. create 2 new linked list name (even and odd)
    2. traverse the linkedlist and add them in even or odd if data is even or odd 

    time compleixity - O(n)
    space complexity - O(n)
 */
public class _222_LinkedList_Question_4_Odd_Even {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null ;
        }
    }
    Node head;
    Node tail;

    void addLast(int data){
        Node temp = new Node(data) ;
        if(head == null){
            head = tail = temp;
            return ;
        }
        tail.next = temp ;
        tail = tail.next;

    }
    void print(){
        Node temp = head ; 
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("Null");

    }
    Node oddEven(){
        Node temp = head; 

        // traverse the linkedlist and insert the node accouding to even or odd 
        _222_LinkedList_Question_4_Odd_Even even = new _222_LinkedList_Question_4_Odd_Even();
        _222_LinkedList_Question_4_Odd_Even odd = new _222_LinkedList_Question_4_Odd_Even(); 

        while(temp != null){
            
            if(temp.data% 2 == 0 ){
                even.addLast(temp.data);
            }else{
                odd.addLast(temp.data);
            }
            temp = temp.next;
        }

        // merge the even and odd linkedlist 
        even.tail.next = odd.head;
        head = even.head;
        
        return head;

    }
    public static void main(String arg[]){
        _222_LinkedList_Question_4_Odd_Even ll = new _222_LinkedList_Question_4_Odd_Even();
        for(int i = 1 ; i < 6 ; i++)
        ll.addLast(i);

        ll.print();

        ll.head = ll.oddEven();

        ll.print();
    }
}
