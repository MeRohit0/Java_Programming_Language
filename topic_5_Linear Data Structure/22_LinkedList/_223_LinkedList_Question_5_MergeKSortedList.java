/*
    Merge k Sorted Lists

    We have K sorted linked lists of size N each, merge them and print the sorted output.

    Sample Input 1: k = 2, n =  2
    l1 = 1->3->NULL
    l2 = 6->8->NULL
    l3 = 9->10->NULL
    Sample Output 1: 1>3->6->8->9->10->NULL

    Approach - 
        1. which ever is lower put into new linkedlist 
        2. return the linkedlist when we traverse the all linkedlist 


        Time complexity - O(n * logn)
        space complexity - O(n)
    */

public class _223_LinkedList_Question_5_MergeKSortedList {
    
    public static class Node {
        int data; Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static void print(Node head ){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }System.out.println();
    }

    static Node sorted(Node a , Node b){
       Node temp = null ;
        if(a  == null ){
            return b;
       }
       if(b == null ){
        return a;
       }
       if(a.data >= b.data){
            temp = b;
            temp.next = sorted(a , b.next);
       }
       else{
            temp = a;
            temp.next = sorted(a.next , b);
       }
       return temp ;
    }
    static void mergeKSortedList(Node arr[] , int k ){
        
        for(int i = 1; i < k ; i ++){
            arr[0] = sorted(arr[0], arr[i]);
        }
        print(arr[0]);
    }

    public static void main(String[] args) {
        int k = 3 ;
        
        Node arr[] = new Node[k];


        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        
        arr[1] = new Node(6) ;
        arr[1].next = new Node(8);
        
        arr[2] = new Node(9) ;
        arr[2].next = new Node(10);


        mergeKSortedList(arr , k );
        

    }
    


}
