/*
    Program to Print the Reverse on ArrayList
    size() method  is used to get the size of ArrayList 

    ArrayList is also 0th based indxing 
    
    Time complexity  - O (n)
 */

import java.util.ArrayList;
public class _202_Print_Reverse {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1.size());

        for(int i = 0 ; i < list1.size() ; i ++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        System.out.println("Print Reverse of the ArrayList");
        for(int i = list1.size() - 1 ; i >= 0 ;  i--){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}
