/*
    Program to connect the zig - zag from the linkedlist
        here I am using my userdefined linkedlist (not from collection framework)

        zig-zag sequence  first node , last node , second node , last second node .....
        
        our node : 1 -> 2 -> 3 -> 4 -> 5

        zig zag  : 1 -> 5 -> 2 -> 4 -> 3    

 */
public class _217_Zig_Zag_LinkedList {
    
    static Node zigZag(Node head){
        // Step 1 : divide into two part ( left node and right node )
            // find the mid point using slow- fast method 
                Node slow = head ;
                Node fast = head.next ;

                while( fast != null && fast.next != null ){
                    slow = slow.next ; 
                    fast = fast.next.next;
                }

                Node mid = slow ;
                // broke the mid node link into left and right 
                Node left = head;
                Node right = mid.next;
                mid.next = null;
            
            // reverse the 2nd half LinkedList
                Node curr = right ;
                Node prev = null; 
                Node next ;
                while(curr != null){
                    next = curr.next;
                    curr.next = prev ;
                    prev = curr;
                    curr = next;
                }
                right = prev;

        // Step 2 : perform zig - zag 
                //link one node from left to one node from right  

                Node newLeft ;
                Node newRight ;

                while(left != null && right != null){
                    // zig - zag link from left to right and right to left 
                        newLeft = left.next ;
                        left.next = right ;
                        newRight = right.next ;
                        right.next = newLeft ; 
                    // move to next node 
                        left = newLeft;
                        right = newRight;
                }
        
        return head;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        _214_LinkedList_Introduction ll = new _214_LinkedList_Introduction();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(6);

        // 1 -> 2 -> 3 -> 4 -> 5
        ll.print();

        ll.head = zigZag(ll.head);
        
        // 1 -> 5 -> 2 -> 4 -> 3
        ll.print();

    }
}
