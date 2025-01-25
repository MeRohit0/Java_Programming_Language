/*
    Palindrome Linked List
    We have a singly linkedlist of characters ,write a function that returns true if the given 
    list is a palindrome, else false

    Input: A->B->C->B->A
    Output: Yes It is Palindrome

    time complexity - O(n)
    space complexity - O(n)
 */
import java.util.Stack;

class Node4{
    char data;
    Node4 next;
    Node4(char data){
        this.data= data;
        this.next= null;
    }
}
public class _336_Stack_Question_1_Palindrome {
    
    public static boolean isPalindrome(Node4 list){
        
        Node4 temp = list ;
        Stack<Character> stack = new Stack<>();

        // push all elements into stack (we got reverse order element)
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        // check if all element are equal or not 
        temp = list;
        while(temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }

    public static void main(String args[]){
        
        // linked list 
        Node4 one = new Node4('A');
        Node4 two = new Node4('B');
        Node4 three = new Node4('C');
        Node4 four = new Node4('B');
        Node4 five = new Node4('A');
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(isPalindrome(one)?"YES":"NO");

    }
}
