/*
    Program to calculate the maximum rectangular area in histogram
    Given an array of integers heights representing the histogram's bar height where the width of each 
    bar is 1 , return the maximum area of largest rectangle in the histogram.
    
    example 
    input - height[] = [2,1,5,6,2,3]
    output - 10 

    Approach - 
        we will traverse array from left to right and calculate the width for i'th index using the next smaller left & next smaller right 
        and then find the area 

    Psedocode - 
        1. calculate the next smaller element left and right 
        2. we will evaluate width using both array smaller element left and right as j - i - 1;
        3. we will calculate the area and store in result array 
        4. we will find the maximum area from the result array 

        Time complexity - O(n)
        Space complexity - O(n)
 */
import java.util.Stack;
public class _335_Max_Rectangular_Area_In_Histogram {
    public static void maxArea(int arr[]){

        int maxArea = 0 ;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1 ; i >= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);

        }

        // next smaller left 
        s = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++){
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);

        }
        // current area : width  = j - i - 1 = nsr[i] - nsl[i] - 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currAraa = height * width ;
            maxArea = Math.max(currAraa,maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int arr2[] = {2,4};
        maxArea(arr);
        maxArea(arr2);
    }
}
