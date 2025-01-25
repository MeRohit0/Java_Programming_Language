/*
    Question 1:Given an integer array nums, return true if any value appears at least twice 
        in the array, and return false if every element is distinct.

        1. approach bruteforce time complexity - O(n^2) 
        2. HashSet approch time complexity - O(n)

*/

import java.util.*;
public class _112_arrays_question1 {
    
    public static boolean repeat_twice(int nums[]){
        boolean twice = false ;
        
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[j] && twice == false ) {
                    twice = true ;
                    return twice ;
                }
            }
        }
        return twice ; 
    }

    public static boolean containsDuplicate(int num[]){

        HashSet <Integer> set = new  HashSet<Integer>();
        for (int i = 0; i < num.length; i++) {
            if(set.contains(num[i])){
                //check if its present 
                return true ;
            }else{
                //add element to hashset 
                set.add(num[i]);
            }
        }       
        return false ; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        if( repeat_twice(arr) == true ){
            System.out.println("Number is repeat in array");
        }
        else{
            System.out.println("No Repeat in array");
        }

        System.out.println("\n----2nd approach----\n");

        if( containsDuplicate(arr) == true ){
            System.out.println("Number is repeat in array");
        }
        else{
            System.out.println("No Repeat in array");
        }
    }
    
}
