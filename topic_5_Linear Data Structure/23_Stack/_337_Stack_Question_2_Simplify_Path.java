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

    public static String simplifyPath(String str){
        
        
    }
    public static void main(String args[]){
        String str1 = "/apnacollege/";
        String str2 = "/a/./b/../../c/";

        String str = simplifyPath(str1);
        System.out.println(str);

    }
}
