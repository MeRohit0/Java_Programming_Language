/*
    Find if any pair in a sorted and rotated ArrayList has a target sum 
        list =  [11,15,6,8,9,10]  , target = 16


NOTE : check the modulor operator at line 45 and 47 it used to rotate between in array 

    Approach - 
        Two pointer method 

        1 . First find the pivot element in Sorted & Rotated ArrayList 
        2 . we have two pointer i.e. lp & rp 
        3 . Find pair via 3 case :
            case 1 : ( element at lp ) + ( element at rp ) == target    return true  
            case 2 : ( element at lp ) + ( element at rp ) > target     ( n + rp - 1 ) % n
            case 3 : ( element at lp ) + ( element at rp ) < target     ( lp + 1 ) % n 

 */
import java.util.ArrayList;
public class _209_Pair_Sum_2 {

    public static boolean pairSum2(ArrayList<Integer> list ,int target ){
        int n = list.size();

        //find pivot in sorted and rotated array 
        int pivot = -1 ;
        for ( int i = 0; i < n; i++) {

            if( !(list.get(i) < list.get(i+1)) ){
                pivot = i ; 
                break;
            }
        }


        //find any pair equals to target    [11,15,6,8,9,10] was before rotated [6,8,9,10,11,15]
        int lp = pivot + 1 ;
        int rp = pivot ;

        while(lp != rp ){
            if( list.get(lp) + list.get(rp) == target ){
                return true ;
            }
            if ( list.get(lp) + list.get(rp) > target  ){
                //decrease the right pointer using modulor operator 
                rp =  (n + rp - 1) % n ;        // check this modulor method to array rotation 
            }else{
                lp = ( lp + 1 ) % n;
            }
        }
        
        return false;

    }
    static void print(boolean value , int target ){
        //print the 
        if(value == true )
            System.out.println("Pair is present for " + target);
        else 
            System.out.println("Pair is not present for "+ target);
    }
    public static void main(String[] args) {

        //initialize the arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16 ;

        //function call 
        boolean value = pairSum2(list, target);
        print(value,target);
        

        int target2 = 376;
        boolean value2 = pairSum2(list, target2);
        print(value2,target2);
    }
}
