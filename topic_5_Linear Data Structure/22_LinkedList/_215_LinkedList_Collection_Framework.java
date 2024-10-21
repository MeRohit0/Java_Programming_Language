/*
    here we have use the collection framework for LinkedList 
    methods
    We cannot use the primitive datatype 
    
    1 . add     addFirst        addLast
    2 . remove  removeFirst     removeLast
    3 . print
 */
import java.util.LinkedList;

public class _215_LinkedList_Collection_Framework {
    public static void main(String args[]){    
        // here linkedlist is only work with objects so 
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.add(3);
        System.out.println(ll);
        // remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        
    }

}
