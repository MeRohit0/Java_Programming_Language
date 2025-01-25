/*
    Program to push at the bottom of stack

    ->  3  ->   3
        2       2
        1       1
                5

    here we have push the element at the bottom of the stack 

    Approach - 
                time complexitu - O(n)
                space complexity - O(n)
        
        1. we pop the element from the top of stack and store it to temp variable 
        2. then call recursion call until base case encounter i.e. stack is empty then we add the number we want to add at bottom
        3. then during return we add the temp variable into stack 


 */
import java.util.Stack;
public class _228_Stack_Push_At_Bottom_of_Stack {

    public static void pushAtBottom( Stack<Integer> stack , int num ){
        // base case 
        if(stack.isEmpty()){
            stack.push(num);
            return ;
        }
        // working 
        int temp = stack.pop();
        pushAtBottom(stack, num);
        stack.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        // recursive function call time complexitu - O(n)
                // space complexity - O(n)
        pushAtBottom(s, 5);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
