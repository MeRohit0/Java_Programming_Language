/*
    inbuild sort 
    using the sort method which is provided by the java 
    In assending order and decending order 
    
    time complexity - O(n . log(n) )         n*log(n)
    
    
    import package the java.util.*
    1. Arrays.sort(arr);
    2. Array.sort(arr, start_index , end_index);
    3. Arrays.sort(arr,Collections.reverseOrder());
    4  Arrays.sort(arr, start_index , end_index , Collections.reverseOrder());
    NOTE - end_index is not included & Collection.reverseOrder() works with Integer objects 

*/

import java.util.*;
public class _120_inbuildSort {
    //polymorphism
    public static void printarray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printarray(Integer arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[] = {4,3,1,5,2};
        
// Arrays.sort(arr);
        Arrays.sort(arr);

        //print the array 
        printarray(arr);

        int arr2[] = {9,3,1,6,2,7,5,8,4};

//Array.sort(arr, start_index , end_index);
//note - end_index is not included 

        Arrays.sort(arr2,0,4);
        //print the array
        printarray(arr2);

/*
collections method to arrange them in decending order.
they work on objects and class like - Integer
 
Arrays.sort(arr,Collections.reverseOrder());
Arrays.sort(arr, start_index , end_index , Collections.reverseOrder());

*/
        Integer arr3[] = {73,21,43,16,34,8,38,54,87,2,45,1};

        //sort in decending order
        Arrays.sort(arr3,Collections.reverseOrder());

        //print array
        printarray(arr3);

        Integer arr4[] = {2,45,1,7,23,5,6,2,35,85,45,12,87};

        //sort in decending order 
        Arrays.sort(arr4,0,5,Collections.reverseOrder());
        //print array
        printarray(arr4);
    }
}
