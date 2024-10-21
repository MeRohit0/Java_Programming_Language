/*
    Swapping Nodes in a Linked List
    
    We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
    swapped by changing links. Swapping data of nodes may be expensive in many situations when
    data contains many fields. 
    
    It may be assumed that all keys in the linked list are distinct.
    
    Sample Input 1: 1->2->3->4,  x = 2, y = 4
    Sample Output 1: 1->4->3->2


 */
public class _221_LinkedList_Question_3_SwappingNode {
    class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node last;

    void addLast(int n ){
        Node temp = new Node(n);
        if(head == null){
            head = last = temp;
            return ;
        }
        last.next = temp ;
        last = last.next;
        
    }

    Node find(int target){

        Node temp = head;
        Node prev = null;

        if(head.data == target ){
            return head;
        }
        while(temp != null){
            
            if( temp.data == target ){
                return prev;
            }
            prev = temp ; 
            temp = temp.next;
        }
        return prev;
    }
    void swapNodes(int key1 , int key2 ){
        // get node which have to swap 

        // get both previous location 
        Node prev1 = find(key1);
        Node prev2 = find(key2);
        
        Node curr1 = prev1.next;
        Node curr2 = prev2.next;
        Node next1 = curr1.next;
        Node next2 = curr2.next;

        // swap 
        curr1.next = next2;
        curr2.next = next1;
        prev1.next = curr2;
        prev2.next = curr1;

    }
    void printLinkedlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        _221_LinkedList_Question_3_SwappingNode ll = new _221_LinkedList_Question_3_SwappingNode();

        for(int i = 1 ; i < 6 ; i++){
            ll.addLast(i);
        }
        ll.printLinkedlist();

        ll.swapNodes(1, 6);
        ll.printLinkedlist();
    }

}
