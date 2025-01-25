/*
    Intersection of Two Linked Lists
    
    In a system there are two singly linked list. By some programming error, the end node ofone
    of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a
    program to get the point where two linked lists merge.

    We have to find the intersection part in this system.

    1 -> 2 -> 3 -> 6 -> 7
         
         4 -> 5 -> 6 -> 7

    Approach - 
        1 . Brute Force method TC - O(n ^ 2)
        2 . Optimized method TC - O(n+m)

    1 . Brute Force method TC - O(n ^ 2)

        step 1 : Start with the head of first linkedlist and compare with all other node of 
                    second linked list till the end of linkedlist second linked list
        
        Step 2 : if both node referenced value is equal then we get the answer 
                    else continue till end of first linked list .
        
    2 . Optimized method TC - O( n+m )

        step 1 : initialize first variable (temp1) with the first linked list and second variable(temp2) with head of second linked list
        step 2 : check if there referencial value is equal return node else continue 
        step 3 : if (temp1.next == null) then assign temp1 = head2;
                    and if(temp2.next == null) then assign temp2 = head1;
        step 4 : they will return the node value if they are intersecting else return null they don't intersect
 */
class Node1 {
    int data ;
    Node1 next;
    Node1(int data){
        this.data = data;
        next = null;
    }
}
public class _220_LinkedList_Question_1 {

    // Brute force method   time complexity - O(n ^ 2)
    public static Node1 intersection(Node1 head1 , Node1 head2 ){

        Node1 temp1 = head1; 
        Node1 temp2 = head2; 

        while(temp1 != null){
            
            while(temp2 != null){
                if(temp1 == temp2){
                    return temp1;
                }
                temp2 = temp2.next;
            }

            temp2 = head2;          //restart the temp2 node 
            temp1 = temp1.next;     //check the temp1 with temp2 
        }
        return null;
    }
    // optimize method time complexity - O(n + m)
    public static Node1 intersection2(Node1 head1 , Node1 head2){
        Node1 temp1 = head1;
        Node1 temp2 = head2;
        while( temp1 != null && temp2 != null ){
            if(temp1 == temp2 ){
                return temp1 ;
            }
            if(temp1.next == null){
                temp1 = head2;
            }
            if(temp2.next == null){
                temp2 = head1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;    // in case they have not 
    }
    public static void print(Node1 val){
        if( val != null ){
            System.out.println("Intersection found at location " + val );
        }else{
            System.out.println("No intersection");
        }
    }
    public static void main(String args[]){

        Node1 head1 = new Node1(1);
        head1.next = new Node1(2);
        head1.next.next = new Node1(3);  //1 -> 2 -> 3

        Node1 head2 = new Node1(4);
        head2.next = new Node1(5);       // 4 -> 5

        Node1 newNode = new Node1(6);
        newNode.next = new Node1(7);     // 6 - > 7

        head1.next.next.next = newNode;     //  1 -> 2 -> 3 -> 6 -> 7
        head2.next.next = newNode ;         //  4 -> 5 -> 6 -> 7

        Node1 val = intersection(head1, head2);      // bruteforce method O(n ^ 2)
        print(val);

        Node1 val2 = intersection2(head1, head2);    // optimized method O(n+m)
        print(val2);
        

    }
}
