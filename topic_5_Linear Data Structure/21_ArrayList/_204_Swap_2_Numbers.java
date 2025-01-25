/*
    Program to Swap the 2 Numbers 

    Time complexity - O(n)
 */
import java.util.ArrayList;
public class _204_Swap_2_Numbers {
    
    public static void swap(ArrayList<Integer> list  , int idx1 , int idx2 ){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        int idx1 = 2  , idx2 = 5;
        swap(list, idx1, idx2);

        System.out.println(list);
    }
}
