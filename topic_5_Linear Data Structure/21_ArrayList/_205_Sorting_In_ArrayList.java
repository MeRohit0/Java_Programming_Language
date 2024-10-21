/*
    Program to sorting an ArrayList 

 */
import java.util.ArrayList;
import java.util.Collections;

public class _205_Sorting_In_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(82);
        list.add(63);
        list.add(32);
        list.add(42);
        list.add(72);
        list.add(84);
        list.add(56);

        System.out.println(list);

        //  sort in ascending order 
        Collections.sort(list);
        System.out.println(list);
        
        //sort in decending order
        Collections.sort(list , Collections.reverseOrder());
        //using comparator  - log function 
        System.out.println(list);
        
    }
}
