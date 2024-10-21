/*
    Program for the friends pairing problem 
    
    Given n friends , even one can remain single or can be pair up with some other friend. Each friend
    can be paired only once .Find out the total number of way in which friend can be remained single 
    or can be paired up 



 */
public class _175_Friends_Pairing_Problem {

    public static int friendsPairing(int n ){
        //base class
        if( n == 1 || n == 2){
            return n;
        }
        //working
            // choice
            // single + pair
            return friendsPairing(n - 1 ) + (n - 1) * friendsPairing(n - 2 ) ;
    }
    public static void main (String args[]){
        System.out.println(friendsPairing(4));
    }
}
