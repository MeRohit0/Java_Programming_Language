/*
    Question 1 : 
    
    Apply Merge sort to sort an array of Strings. (Assume that all the characters in
    all the Strings are in lowercase). 
    
    Sample Input 1: arr = { "sun", "earth", "mars", "mercury" }
    Sample Output 1: arr = { "earth", "mars", "mercury", "sun"}

    Approach - 
    1 . divide the arr by mid value (until 1 element left)
    2 . mergeSort for left and right array {into single element array }
    3 . copy value to original array from temp array 

NOTE : Check the Arrays.toString(str); on line no 72 

    Time Complexity - O( n* log n )
    Space Comlexity -O ( n )

 */

import java.util.Arrays;

public class _184_Divide_And_Conquer_Question_1 {

    public static void merge(String str[] , int left , int right , int mid ){

        int p1 = left , p2 = mid+1 , p3 = 0 ;
        String arr[] = new String[right - left + 1 ];   //initialize the temp varaible 

        while(p1 <= mid && p2 <= right ){
            
            if( str[p1].compareTo(str[p2]) <= 0){
                arr[p3] = str[p1];
                p3++; p1++;
            } 
            else{
                arr[p3] = str[p2] ;
                p3++; p2++; 
            }
        }

        while(p1 <= mid ){
            arr[p3] = str[p1];
            p3++; p1++;
        }
        while(p2 <= right){
            arr[p3] = str[p2];
            p3++; p2++;
        }

        // transfer the data back to arr from temp variable 
        for(int i = 0 ; i < arr.length ; i++){
            str[i+left] = arr[i];
        }

    }
    public static void mergeSort(String str[] , int left , int right ){
        //base case 
        if(left >= right ){
            return ;
        }
        //working 
        int mid = left + (right - left )/2 ;        //divide the arrays into 2 parts 
        mergeSort(str , left , mid);                //  left part 
        mergeSort(str, mid + 1 , right);            //  right part
        merge(str, left, right , mid );             //  merge them 
    }

    public static void main (String args[]){
        String[] str = { "sun", "earth", "mars", "mercury" };
        mergeSort(str , 0 , str.length - 1 );
        System.out.println(Arrays.toString(str));       // print the array using Arrays class convert into string 
    }
}
