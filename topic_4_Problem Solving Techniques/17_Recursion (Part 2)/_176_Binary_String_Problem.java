/*
    Program for Binary String Problem 
        Print  all binary strings of size n without consecutive one 
                    output

        for n = 0       ""  (empty string)
            n = 1       "1" or "0"

        we have two choices 
        print 0         print 1  at n'th place 

        but at n - 1 th place 
        we have choices as if lastPlace = 0 we have either "1" or "0"
                            if lastPlace = 1 we have only one choice i.e. "0"

    NOTE : IN THIS WE HAVE USE THE STRING WHICH ADD '0' OR '1' AND GIVE NEW STRING
             REFERENCE IN RECURSIVE CALL 
    Approach  - 
        
        //working 
        // if(lastplace == 0){
        //     // "00"
        //     binaryStringProblem(n-1, 0 , str + "0" );
        //     // "01"
        //     binaryStringProblem(n-1, 1 , str + "1" );
        // }else{
        //     // "10"
        //     binaryStringProblem(n-1, 0 , str+ "0" );
        // }


 */
public class _176_Binary_String_Problem {
    public static void binaryStringProblem(int n , int lastplace , String str){
        
        // base case 
        if(n == 0 ){
            System.out.println(str);
            return ;
        }
        //working 
        binaryStringProblem(n-1 , 0, str + "0");
        if(lastplace == 0 ){
            binaryStringProblem(n-1, 1, str +"1");
        }

    }
    public static void main(String[] args) {
        binaryStringProblem(3, 0 , "");
    }
}
