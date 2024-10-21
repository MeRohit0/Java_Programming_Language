/*
    Question 2 :
    
    Keypad Combinations
    
    Given a string containing digits from 2-9 inclusive, print all possible letter combinations that
    the number could represent. You can print the answer in any order.
    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
    does not map to any letters.

     Input  - digits = "23"
     Output - "ad", "ae", "af", "bd", "be", "bf","cd", "ce", "cf"
    

    Time complexity - O(4 ^ n )
    Space complexity - O(n)

 */
public class _198_Backtracking_Question_2_Keypad_Combination {
    
    final static char[][] keypad = {
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'u','v','w'},
        {'x','y','z'},
    };

    public static void lettercombination( String givenString ){

        int len = givenString.length();
        if(len == 0){
            System.out.println("");
            return ;
        }

        recursive_call( 0 , len, "", givenString);

    }
    // This function has position and length of givenString , and we check 
    public static void recursive_call(int pos , int len  , String outputString ,String givenString ){
        //base case 
        //working 
        if(pos == len ){                            //backtracking condition
            System.out.println(outputString);
            return ;
        }
        else{
            char[] letters = keypad[givenString.charAt(pos) - '0'];     //check the value of keypad as we have to convert into integer
            for (int i = 0; i < letters.length; i++) {
                recursive_call(pos+1, len, outputString + letters[i], givenString);
            }
        }
    }

    public static void main (String args[]){

        lettercombination("272");
    }
}
