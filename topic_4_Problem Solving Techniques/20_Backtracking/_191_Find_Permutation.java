/*
    Program to find the all permutation of a string

    str = {abc};
    abc,acb,bac,bca,cab,cba

    approach - 
        we use loop to add sub sequence of array and we backtrack to enumerate all possible answer

NOTE : Check the substring function and the for loop implemantation 

    Time Complexity - O(n * n!) ----> O( n * 2 )
    Space Coplexity - O( n )

 */
public class _191_Find_Permutation {
    public static void permutation(String str , String newStr){
        //base case 
        if(str.length() == 0){
            System.out.println(newStr);
            return ;
        }
        //working 

        for (int i = 0; i < str.length(); i++) {

            char curr =  str.charAt(i);

            // example - >  {abcde} ---->  {ab} + {de} = {abde}
            String nstr = str.substring(0, i) + str.substring(i+1);
            permutation( nstr, newStr + curr );
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
