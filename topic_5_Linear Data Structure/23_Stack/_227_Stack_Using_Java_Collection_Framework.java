/*
    Stack implemented using the java Collection Framework ( JFC )

    it is most straight forward method 
*/
import java.util.Stack;
public class _227_Stack_Using_Java_Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
