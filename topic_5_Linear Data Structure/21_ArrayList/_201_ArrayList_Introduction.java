/*
    Introduction of ArrayList 

    It is the part of Java collection framework it has flexible size 
    It is does't created for primitive datatype i.e. int , boolean , char
    but we can make on using the Wrapper Class like Integer , Boolean , Character or user defined class
    
        Array                                           ArrayList

    1.  fixed                                           Dyanamic 
    2.  Primitive datatypes can be stored               Primitive Datatype can't be stored directly

    ArrayList is implemented using array only initially when we create a new object it has some fixed
        size value of array then when its filled its internally create new array of double size from 
        previous array 
        
Operation on ArrayList
    
    Operations                  Time Complexity
    
    1. Add element                  O(1)
    2. Get element                  O(1)
    3. Remove element               O(n)
    4. set element at index         O(n)
    5. contains element             O(n)
 */

import java.util.ArrayList;

public class _201_ArrayList_Introduction {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        System.out.println("Integer class   :" + list1);
        System.out.println("Boolean class   :" + list2);
        System.out.println("Character class :" + list3);
        
        
        //This is add operation
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        list1.add(2,10);    // add method at ( index , data )
        System.out.println(list1);

        list1.addFirst(53);       // addFirst insert value at index 0      
        list1.addLast(93);        // addLast insert the value at index n
        System.out.println(list1);
       
       
        //This is get operation     -- used to get the value in ArrayList
        int value = list1.get(2);
        System.out.println("\nvalue stored at place 3 is "+value +"\n");
        System.out.println(list1.getLast());    // getlast is used to get the last element 

        //This remove element 
        list1.remove(5);
        System.out.println(list1);

        //this set element at index 
        list1.set(3, 47);
        System.out.println(list1);

        //This is contains 
        System.out.println(list1.contains(5));
        System.out.println(list1.contains(36));

    }
    
}
