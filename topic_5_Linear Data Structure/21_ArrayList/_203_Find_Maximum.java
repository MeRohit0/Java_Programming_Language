/*
    Program to find the maximum in the ArrayList 
        get method is used get the value at the index 

    Time Complexity - O(n)
 */
import java.util.ArrayList ; 
public class _203_Find_Maximum {
    public static void main (String args[]){
        
        ArrayList <Integer> list1 = new ArrayList<>();

        //initializing the ArrayList 
        list1.add(45);
        list1.add(42);
        list1.add(71);
        list1.add(4);
        list1.add(23);

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < list1.size() ; i ++){
            // if(max < list1.get(i)){
            //     max = list1.get(i);
            // }
            max = Math.max(list1.get(i), max);
        }

        System.out.println("Maximum value in the ArrayList is : " + max);

    }
}
