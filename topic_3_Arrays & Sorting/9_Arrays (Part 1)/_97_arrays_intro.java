/*
    Definition of Arrays - 
    list of elements of the same type placed in a contiguous memory location
    
    0 - based indexing in java and c++ 

    int [] arr = [1,2,3,4,5,6,7,8];

    System.out.printlm(arr[0]); ---> at index 0 there is 1 integer  

    Operations in Arrays 

    🔘1. create 
    🔘2. input 
    🔘3. output 
    🔘4. update

    creating an array 

    SYNTAX : datatype arrayName[] = new datatype[size];


 */

public class _97_arrays_intro {
    public static void main(String args[]){
        //creating an array 
        //different ways to declare 
        int marks[] = new int[50];

        int numbers[] = {1,2,3};

        double moreNumbers[] = {4,5,6};

        String fruits[] = {"mango", "orange", "apple"};
        
        //they all save memory location of array 
        System.out.println(marks);
        marks = numbers;
        System.out.println(marks);
        System.out.println(marks[1]);

        System.out.println(numbers);
        System.out.println(moreNumbers);
        System.out.println(fruits);
    }
    
}
