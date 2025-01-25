/*
    Program for mergeSort on the linkedlist 
        here I am using my userdefined linkedlist (not from collection framework)

    Approach - 

        Step 1 : find mid point 
                    using the fast and slow method
        Step 2 : divide into 2 linkedlist 
                    and remove the link from left.next = null 

        Step 3 : combine (conquer)
                    merge the two sorted linked list 
                    and set the head.next = merge();
*/

public class _216_MergedSort {

    static Node midPoint(Node head){
        // fast - slow floyd's method 
        Node slow = head ;
        Node fast = head.next ; // we are geting the left side + 1 to insure stability 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next ; 
        }
        return slow ; 
    }

    static Node merge(Node left , Node right ){
        // declare new temp node and initialize with -1 
        Node newLinkedList = new Node(-1);
        Node temp = newLinkedList;
        
        while( left != null && right != null ){
            if(left.data >= right.data){
                temp.next = right;
                temp = temp.next;
                right = right.next ;
            }else{
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
        }
        // remaining item 
        // left half node 
        while(left != null){
            temp.next = left; 
            temp = temp.next;
            left = left.next;
        }
        // right half node 
        while(right != null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        // delete the first -1 node and then return 
        return newLinkedList.next;
    }

    static Node mergeSort(Node head){
        //base case 
        if(head == null || head.next == null){
            return head;
        }
        // Step 1 : find mid point 
            Node mid = midPoint(head);

        // Step 2 : divide 
            Node newRight = mid.next;
            mid.next = null;                // Important we have to remove the link from first half of linkedlist
            Node left = mergeSort(head);
            Node right = mergeSort(newRight);

        // Step 3 : combine (conquer)
            return merge(left , right);
    }
    @SuppressWarnings("static-access")
    public static void main (String args[]){
        _214_LinkedList_Introduction ll = new _214_LinkedList_Introduction();
        
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        // 5 -> 4 -> 3 -> 2 -> 1
        
        ll.print();

        ll.head = mergeSort(ll.head);           // we have to point the head 

        ll.print();

    }

}
