/*
    Program to reverse the stack
    ->  1   ->  5  -> 
        2       4
        3       3
        4       2
        5       1

    Approach - 

    1. pop the value 
    2. call the recursive function 
    3. addatthebottom in stack

    time complexity -O(n ^ 2)
    space complexity -O(1)
 */
import java.util.Stack;

public class _330_Reverse_A_Stack {
    
    public static void addAtBottom( Stack<Integer> s, int num){
        if(s.isEmpty()){
            s.push(num);
            return ;
        }
        int temp = s.pop();
        addAtBottom(s, num);
        s.push(temp);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int temp = s.pop();
        reverseStack(s);
        addAtBottom(s,temp);

    }
    public static void printStack(Stack<Integer> s){
        if(s.isEmpty()){
            System.out.println();
            return ;
        }
        int data = s.pop();
        System.out.print(data + " ");
        printStack(s);
        s.push(data);
    }
    public static void main(String args[]){
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Original Stack : ");
        printStack(stack);
        reverseStack(stack);
        System.out.print("Reversed Stack : ");
        printStack(stack);

    }

}
