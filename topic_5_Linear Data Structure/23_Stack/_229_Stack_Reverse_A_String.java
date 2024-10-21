/*
    Program to reverse a String using the stack 
    
        abc - cba 

    Approach - 

        we put the string value into stack and pop the values from the stack it will reverse it 
        string abc ->   c  -> newstring = cba
                        b
                        a

 */
import java.util.Stack;

public class _229_Stack_Reverse_A_String{
    public static StringBuilder reverseAString(String str ){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            s.push(str.charAt(i));
        }
        StringBuilder newstr = new StringBuilder("");
        while(!s.isEmpty()){
            newstr.append(s.pop());
        }
    return newstr;
}
    public static void main(String[] args) {
        String str = "12421";
        StringBuilder newstr = reverseAString(str);
        System.out.println("Before reverse : " + str);
        System.out.println( "After reverse : " + newstr);
    }
}