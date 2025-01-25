/*
    Lonely Numbers in ArrayList
    
    You are given an integer arraylist nums. A number x is lonely when it appears only once, and 
    no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.Return all lonely numbers in nums.
    You may return the answer in any order.

    Sample Input 1: nums = [10,6,5,8]
    Sample Output 1: [10,8]

    Sample Input 2: nums = [1,3,5,3]
    Sample Output 2: [1,5]

    Approach - 
        
    1 . Brute force method 

        search for the value in arraylist 
            in entire list for value - 1 , value + 1 and same value present for more then 1 time 
            
        Time complexity - O(n ^ 2 )
        Space complexity - O(n)

    2 . Optimized Sorting method

        1. We will first sort the Arraylist 
        2. we will iterate every element (value) of arraylist
            case 1 :  if (left side is less then value or equal available)   then continue ;
            case 2 :  if (right side is greater then value or equal available)   then continue ;
        3. if we get any element not meet above condition then we add into result arraylist
        4. we will continue this step from 2 - 3 until list is finished 

        Time complexity - O(n * logn)
        Space complexity - O(n)


 */
import java.util.ArrayList;
import java.util.Collections;
public class _211_ArrayList_Lonely_Number_Question_2 {
    
    public static boolean find(ArrayList<Integer> list , int num){
        
        int n = list.size();

        for (int i = 0; i < n; i++) {
            if(list.get(i) == num){
                return true;
            }
        }
        return false ;
    }
    public static boolean same(ArrayList<Integer> list , int num){
        int n = list.size();
        int count = 0 ;
        for(int i = 0 ; i  < n ; i ++){
            if(list.get(i) == num ){
                count++;
            }
        }
        if(count >1 )return true;
        return false;
    }
    
    public static ArrayList<Integer> loneyNumber(ArrayList<Integer> list){
        
        ArrayList<Integer> lonelynum = new ArrayList<>();
        
        int n = list.size();
        for(int i = 0 ; i < n ; i ++){
            //check for value + 1 , value - 1 and same value 
            boolean value1 = find(list, list.get(i) + 1 );
            boolean value2 = find(list, list.get(i) - 1 );
            boolean value3 = same(list, list.get(i) );
            

            if( !( value1 || value2  || value3 )){
                lonelynum.add(list.get(i));
            }
        }
        return lonelynum;
    }

    // 2nd Method Sorting 
    public static ArrayList <Integer> loneyNumber2(ArrayList<Integer> list ){
        
        // we first do sorting 
        
        Collections.sort(list);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = list.size();
        
        for(int i = 0 ; i < n ; i ++){

            //check for the left side and check less then value or equal to that number 
            if( i != 0 &&  ( list.get(i - 1 ) == (list.get(i) - 1 )  ||  list.get(i - 1 ) == list.get(i) ) ){
                continue;
            }

            //check for the right side and check greater then value or equal to that number
            if( i != n - 1 && ( list.get(i + 1 ) == (list.get(i)+1)  ||  list.get(i + 1 )  == list.get(i) )){
                continue;
            }
            
            //it is loney number so we add in the list
            result.add(list.get(i) );
        }

        return result;

    }
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(3);
        
        System.out.println(loneyNumber(list));
        System.out.println(loneyNumber(list2));

        System.out.println(loneyNumber2(list));
        System.out.println(loneyNumber2(list2));


    }
}
