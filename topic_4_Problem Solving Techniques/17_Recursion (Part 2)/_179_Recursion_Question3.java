/*
    Write a program to find Length of a String using Recursion.
 */
public class _179_Recursion_Question3 {
    public static int stringLength( String str){
        //working 
        if(str.length() == 0 ){
            return 0 ;
        }

        return stringLength(str.substring(1) ) + 1 ;
    }
    public static void main(String[] args) {
        System.out.println(stringLength("hello"));
    }
}
