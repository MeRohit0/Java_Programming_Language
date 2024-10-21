/*
    Stack Implemented using the ArrayList 

    Stack_AL is implementation using ArrayList

    implement the function are 
    1. push 
    2. pop
    3. peek 
    4. Java Collection Framework
 */
import java.util.ArrayList;

// stack implemented using ArrayList 
class Stack_AL {
    ArrayList<Integer> ll = new ArrayList<>();
    
    // isEmpty will return is element present
    boolean isEmpty(){
        return ll.size() == 0 ;
    }

    // push will insert the element into stack 
    void push(int data){
        ll.add(data);
    }
    
    // pop will remove the element 
    int pop(){
        if(ll.size() == 0){
            return -1;
        }
        int data = ll.removeLast();
        return data;
    }
    
    // peep operation 
    int peek(){
        if(ll.size() == 0 ){
            return -1;
        }
        return ll.getLast();
    }

}

public class _225_Stack_Using_ArrayList {
    public static void main(String args[]){

        Stack_AL s = new Stack_AL();

        s.push(34);
        s.push(22);
        s.push(32);
        s.push(46);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }

}
