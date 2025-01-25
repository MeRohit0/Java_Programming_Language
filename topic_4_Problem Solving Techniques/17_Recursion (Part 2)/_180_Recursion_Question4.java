/*
    We are given a string S, we need to find the count of all contiguous substrings
        starting and ending with the same character.

        Input : S = "abcab"
        Output : 7

        There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab,
            a, ab, b . 
            Out of the above substrings, 
            there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
            contiguous substrings start and end with the same character.
 */
public class _180_Recursion_Question4 {

    public static int contSubstring(String str , int start , int end , int n ){
        //base case
        if(n == 1 ){
            return 1 ;
        }
        if(n <= 0 ){
            return 0 ; 
        }
        //working
        int result = contSubstring(str, start + 1, end , n-1) +
                    contSubstring(str, start , end - 1 , n-1) -
                    contSubstring(str, start + 1, end - 1  , n-2);


        if(str.charAt(start) == str.charAt(end) ){
            result ++;
        }
        return result;

    }
    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        System.out.println(contSubstring(str, 0, n - 1,  n));
    }
}
