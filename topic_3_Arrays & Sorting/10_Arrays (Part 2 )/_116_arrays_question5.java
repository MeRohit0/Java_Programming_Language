/*
    Question 5: 
    Given an integer array nums, return all the triplets [nums[i], nums[j], 
    nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets

  * here i did't not solve the duplicate triplets
    time complexity - O(n ^ 3)
    space complexity - O(1)

 */
public class _116_arrays_question5 {
    public static void tripletSum(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if( arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]  = {-1, 0, 1, 2, -1, -4} ;
        tripletSum(arr);
    }
}
