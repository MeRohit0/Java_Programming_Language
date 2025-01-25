/*
    Stack implemented using the Linkedlist
    NOTE : head is used the point the top most element 

 */

class Node {
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}

// stack is implemented using the linkedlist 
class Stack_LL{
    Node head = null ;
    // isEmpty
    boolean isEmpty(){
        return head == null ? true : false ;
    }
    // push
    void push(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            head = temp;
            return ;
        }
        temp.next = head;
        head = temp;
    }
    // pop
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = head.data;
        head = head.next;
        return val ;
    }
    // peek
    int peek(){
        return head.data;
    }
}
public class _226_Stack_Using_LinkedList {
    public static void main (String args[]){

        Stack_LL s = new Stack_LL();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
