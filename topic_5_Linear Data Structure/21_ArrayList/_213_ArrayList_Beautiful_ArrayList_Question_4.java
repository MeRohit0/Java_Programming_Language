/*
    Beautiful ArrayList(MEDIUM)
    
    An Arraylist nums of size n is beautiful if:
    1 . nums is a permutation of the integers in the range [1, n].
    2 . For every 0 <= i < j < n, there is no index k with i < k < j 
            where 2 * nums.get(k) == nums.get(i) + nums.get(j).
    
    Given the integer n, return any beautiful arraylist nums of size n. There will be at least
        one valid answer for the given n.

    Time complexity - O( 2 ^ n )
 */
import java.util.ArrayList;
public class _213_ArrayList_Beautiful_ArrayList_Question_4 {

    public static ArrayList<Integer> beautifulArray( int n ){

        ArrayList <Integer> ans  = new ArrayList<>();
        ans.add(1);
        
        
        for (int i = 1; i < n; i++) {
            ArrayList <Integer> temp = new ArrayList<>();
            
            for(Integer a : ans){
                //odd number
                int odd = a * 2 -1 ;
                if(odd <= n ){
                    temp.add(odd);
                }
            }

            for(Integer a : ans){
                //even number
                int even = a * 2 ;
                if(even <= n ){
                    temp.add(even);
                }
            }
            ans = temp ; 
        }
        return ans;
}
    public static void main(String args[]){
        int n = 15 ; 
        System.out.println(beautifulArray(n));
    }
}
