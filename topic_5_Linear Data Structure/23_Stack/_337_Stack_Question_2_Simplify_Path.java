/*
    Simplify Path

    We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
    with ‘/’ ( root directory ), a dot in path represent current directory and double dot represents
    parent directory.

    Sample Input 1 : /apnacollege/
    Sample Output 1 : /apnacollege

    Sample Input 1 : /a/..
    Sample Output 1 : /



 */ 
import java.util.Stack;
public class _337_Stack_Question_2_Simplify_Path {

    public static void simplifyPath(String str){
        
        String array[] = str.split("/");
        //divide the array based on "/"
        // for(String s : array){
        // System.out.println(s);} 

        Stack<String> stack = new Stack<String>();

        // String str2 = "/a/b/d/../q/./s/../";
        /*
         * a -> b -> d -> b -> q -> s -> q          <--- working 
         *      a    b    a    b    q    b         <--- stack working
         *           a         a    b    a
         *                          a
         */                         

        for(int i = 0 ; i < array.length ; i++){
            if(array[i].equals("..")){
                stack.pop();
            }else if (array[i].equals(".") || array[i].equals("")){
                continue;
            }else{
                stack.push(array[i]);
            }
        }

        Stack<String> revStack = new Stack<String>();
        while (stack.size() > 0 ) {
            revStack.push(stack.pop());
        }

        if(revStack.isEmpty()){
            System.out.println("/");
        }else{
            String output = "/";
            while(revStack.size() > 0 ){
                if (revStack.size() != 1 ) {
                    output = output + revStack.pop() + "/";
                }else{
                    output = output + revStack.pop();
                }
            }
            System.out.println(output);
        }

    }
    public static void main(String args[]){
        String str1 = "/apnacollege/";
        String str2 = "/a/b/d/../q/./s/../";

        simplifyPath(str1);
        simplifyPath(str2);

    }
}
