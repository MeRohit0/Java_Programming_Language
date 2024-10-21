/*
    Monotonic ArrayList

    Time complexity - O(n)
    Space Complexity -O(1)
    
    An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
        monotone increasing if for all i <= j, nums.get(i)<=nums.get(j)
        monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j)
        Give an Arraylist, return true if the given list is monotonic, or false otherwise.

    input nums = [1,2,2,3]      , output - true 

    */

import java.util.ArrayList;
public class _210_ArrayList_Monotonic_Question_1 {

    public static boolean monotonicIncreasing(ArrayList<Integer> list){
        int n = list.size();
        for (int i = 0; i < n - 1 ; i++) {
            if( !(list.get(i) <= list.get(i+1)) ){
                return false;
            }
        }
        return true;

    }
    public static boolean monotonicDecreasing(ArrayList<Integer> list){
        int n = list.size();
        for (int i = 0; i < n - 1 ; i++) {
            if( !(list.get(i) >= list.get(i+1)) ){
                return false;
            }
        }
        return true;
    }
    public static boolean monotonic(ArrayList<Integer> list){
        
        //check for monotone increasing and decreasing 
        boolean monotonicInc = monotonicIncreasing(list);
        boolean monotonicDec = monotonicDecreasing(list);

        if(monotonicInc || monotonicDec){
            return true;
        }
        return false ;
    }
    static void print(boolean value ){
        if(value == true){
            System.out.println("It is Monotonic ");
        }else{
            System.out.println("It is not Monotonic ");
        }
    }
    public static void main (String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(6);

        boolean isMonotonic = monotonic(list);
        print(isMonotonic);
        
        boolean isMonotonic2 = monotonic(list2);
        print(isMonotonic2);


    }
}
