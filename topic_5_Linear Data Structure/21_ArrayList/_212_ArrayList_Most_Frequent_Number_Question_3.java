/*
    Most Frequent Number following Key

    You are given an integer Arraylist nums. You are also given an integer key, which is present in nums.

    For every unique integer target in nums, count the number of times target immediately follows
    an occurrence of key in nums. In other words, count the number of indices i such that:
        0 <= i <= nums.size() - 2,
        nums.get(i) == key and,
        nums.get(i+1) == target.
    Return the target with the maximum count.
    (Assumption - that the target with maximum count is unique.)
    
    Constraints:
        2 <= nums.size() <= 1000
        1 <= nums.get(i) <= 1000
        Assume that the answer is unique.
    
    Sample Input 1 : nums = [1,100,200,1,100], key = 1
    Sample Output 1:  100



    Time complexity - O(n)
    Space complexity - O(n) 
    
 */
import java.util.ArrayList;
public class _212_ArrayList_Most_Frequent_Number_Question_3 {

    public static int mostFrequesntNumber(ArrayList <Integer> list , int target){
        
        //building our counting array 
        int arr[] = new int[1001];
        
        for(int i = 0 ; i < list.size() - 1  ; i++){
            if( list.get(i) == target ){
                arr[list.get(i+1)]++;
            }
        }

        // find maximum number in counting array 
        int max = 0 ;
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i] ){
                max = arr[i];
                number = i;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        

        int key = 1 ; 
        int key2 = 2 ; 

        System.out.println( "The most Frequent Number Following key ( "+key+" ) in list "+ list +"  is "+mostFrequesntNumber(list, key) );
        System.out.println( "The most Frequent Number Following key ( "+key2+" ) in list "+ list2 +"  is "+mostFrequesntNumber(list2, key2) );
    
    }
}
