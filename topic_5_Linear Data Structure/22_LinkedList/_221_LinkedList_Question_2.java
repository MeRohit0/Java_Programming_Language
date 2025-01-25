/*
    Delete N Nodes After M Nodes of a Linked List
    We have a linked list and two integers M and N. Traverse the linkedlist such that 
    you retain M nodes then delete next N nodes, continue the same till end of the linked list. 

    Approach - 

        Simple take m node and delete n node that it 

 */
class Node2 {
    int data ;
    Node2 next;
    Node2(int data){
        this.data = data;
        next = null;
    }
}
public class _221_LinkedList_Question_2 {
    Node2 head ;
    Node2 last ;
    
    public void addLast(int data ){
        if(head == null){
            head = new Node2(data);
            last = head;
            return ;
        }

        last.next = new Node2 (data);
        last = last.next;

    }
    // Time complexity - O(n)
    public Node2 deleteNnodeFromM(int m , int n){
        
        if(m == 0){
            head = null;
            return null;
        }
        if(n == 0){
            return null;
        }
        
        Node2 temp = head; 
        while(temp != null){        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7      for m = 2 , n = 1     1 -> 2 -> 4 -> 5 -> 7

            // take m node 
            for(int i = 0 ; i < m-1 && temp != null ; i ++){
                temp = temp.next;
            }
            // check for temp != null 
            if(temp == null){
                return null;
            }

            // delete n node 
            Node2 delete = temp ; 
            for(int i = 0 ; i < n && delete != null ; i++){
                delete = delete.next;
            }

            // check for delete != null 
            if(delete == null){
                temp.next = null;
                break;
            }
            temp.next = delete.next;
            temp = temp.next;
        }
        return head;
    }
    void print(){
        Node2 temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        _221_LinkedList_Question_2 ll = new _221_LinkedList_Question_2();
        
        for(int i = 1 ; i < 11 ; i++ ){
            ll.addLast(i);
        }
        
        ll.print();
        ll.deleteNnodeFromM(1, 1);
        ll.print();
        // System.out.printf("%d ", ll.head.data);
    }
}
