/*
    Program to check the valid parentheses using stack 
        A sting only contains these '{','}','[',']','(',')' 

    valid condition is :
        1. Open bracket and closing bracket are same type 
        2. Open bracket must be closed in the correct order 
        3. Every closed bracket must have open bracket 


Approach - 
    we add the open bracket into stack and on encounter closed bracket we will pop 
    the element from stack 


    Pseudocode - 
        
        1. We have string and we will initialize stack 
        2. we will traverse the whole string from start to end 
        3. if we get open bracket we will push into stack 
        4. else on close bracket encounter we will 
            check if stack is empty ? return false : true 
        5. if(stack.top element is not valid parentheses ) return false
        6. when all string is traversed and stack is still not empty return false
            otherwise return false 

    Time Complexity - O(n)
    Space Complexity - O(n)

 */
import java.util.Stack;
public class _333_Valid_Parentheses {

    public static boolean validParentheses(String str){
        
        Stack <Character> stack = new Stack<>();
        
        for(int i = 0 ; i < str.length(); i++){
            // character 
            char c = str.charAt(i);
            
            // open bracket 
            if( c == '(' ||c == '{' || c == '[' ){
                stack.push(c);
            }
            // close bracket
            if(c == ')' || c == ']' || c == '}' ){
                
                if(stack.isEmpty()){
                    return false; 
                }
                if( (stack.peek() == '(' && c ==')') || 
                    (stack.peek() == '{' && c =='}') ||
                    (stack.peek() == '[' && c ==']') )
                {
                    stack.pop();
                }
                else{   
                    // this else is when we get any close bracket which open bracker 
                        // is not present in stack or any other character too 
                    return false;   
                }
            }
        }
        // if stack is still not empty 
        if(!stack.isEmpty()) 
            return false; 
        
        return true;
    }
    public static void main(String args[]){
        String str = "{[()]}";
        System.out.println(validParentheses(str));

        String str2 = "[(()]";
        System.out.println(validParentheses(str2));
    }
}
