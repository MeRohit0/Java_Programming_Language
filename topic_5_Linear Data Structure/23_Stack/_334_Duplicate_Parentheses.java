/*
    Program to find the duplicate parenthesis 
    
    Given a balanced parenthesis , find if it contains any duplicate parentheses or not. 
    A set of duplicate parentheses are the duplicate if the same subexpression is surrounded by multiple
    parentheses.

    Return true if it contains duplicates else return false 

    example 1 : (((a + (b))) + (c + d ))    return true 
    example 2 : (((a) + (b)) + (c+d))       return true 
    example 3 : ((a+b)+(c+d))               return false


    Approach - 
        Traverse the string fpush (open bracket , operator , operand ) into stack
        if we encounter any closed parenthesis we will then initialize & declare the count = 0 
        and try to match with open bracket from stack if we don't find the open bracket we will 
        increment the count because in quesition givenggfhvbgtyand if we get the count == 0 

    Pseudocode 

    1. Initialize a Stack , and we have string 
    2. Travese the whole string from left to right  into char variable ( c )
    3. push open bracket , operator , operand into stack
    4. if we encounter close parentheses then we will initilize the count = 0 
    5. we pop the element from the stack and increment the count +1 until we count the open bracket
    6. count == 0 then we return true
    7. else we push the element into stack


 */
import java.util.Stack;
public class _334_Duplicate_Parentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            
            // close      heres the trick i have to write more code for open bracket then close bracket 
            if( c == ')' ){
                int count = 0 ;
                while( stack.pop() != '('){
                    count ++;      
                }
                if(count < 1 ){
                    return true;
                }
            }
            else{
                stack.push(c);
            }
        }

        return false;
    }
    public static void main(String arg[]){

        String str = "(((a+(b)))+(c+d))";
        System.out.println(isDuplicate(str));

        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str2));
    }
}
