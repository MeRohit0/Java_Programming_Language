/*
    Find if any pair in a sorted ArrayList has a target sum 
    list =  [1,2,3,4,5,6]  , target = 5 

    Approach - 

    1. Brute Force Method 
        check each pair sum which is equal to target 
        return true otherwise false

        Time complexity - O(n ^ 2 )
        Space complexity - O(1)

    2. Two pointer approach 
        input - sorted array 
        we take left pointer (lp) and right pointer (rp) 
            case 1  : if(lp + rp == target ) return true;
            case 2  : if(lp + rp > target ) rp -- ; we have to decrease the sum 
            case 3  : if(lp + rp < target ) lp ++ ; we have to increase the sum 

        Time complexity - O(n)
        Space complexity - O(1)
    
 */

import java.util.ArrayList;

public class _208_Pair_Sum_1 {

    // Brute Force Method 
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        
        int n = list.size();

        for(int i = 0 ; i < n ; i ++){
            for (int j = i+1; j < n; j++) {
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false ;

    }
    // Two pointer method 
    public static boolean pairSum1_TwoPointerMethod(ArrayList<Integer> list , int target){
        
        //input - sorted arraylist , target
        int n = list.size();
        int sp = 0 ;
        int lp = n - 1 ;

        while(sp < lp){
            
            if( list.get(sp) + list.get(lp) == target){
                return true;
            }
            if( list.get(sp) + list.get(lp) > target ){
                lp -- ;
            }else{
                sp++;
            }
        }
        return false;

    }
    //Print the value 
    public static void printvalue( boolean value ,int target ){

        if(value == true)
            System.out.println("Pair  are present for " + target);
        else
            System.out.println("Pair is not present for " + target);

    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //[1,2,3,4,5,6]
        //insert element into list 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5 ;

        //function call 
        boolean value = pairSum1(list, target);
        printvalue(value , target);


        int target2 = 45;

        boolean value2 = pairSum1(list, target2);
        printvalue(value2 , target2);

        printvalue( pairSum1_TwoPointerMethod(list, target) , target);
        printvalue( pairSum1_TwoPointerMethod(list, target) , target2);
        
        
    }
}
