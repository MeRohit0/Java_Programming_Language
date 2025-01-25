/*
    Question 2 : 

    Given an array nums of size n, return the majority element.
    
    The majority element is the element that appears more than ⌊n / 2⌋times. You may assume
    that the majority element always exists in the array.
    
    Sample Input 1: nums = [3,2,3]
    Sample Output 1: 3
    
    Sample Input 2: nums = [2,2,1,1,1,2,2]
    Sample Output 2: 2
    
    Constraints(extra Conditions):
    ● n == nums.length
    ● 1 <= n <= 5 * 104
    ● -109 <= nums[i] <= 109

Approach - 
        using the  Boyer Moore Voting Algorithm

        1 . we initialize with first element as maximum_no and count = 1 
        2 . we will check 
            if the next element in array is same then we increase the count 
            else we check is count is greater then 0 
                if count is greater then 0 then we decrease the count 
                else we change the maximum_no to that number and set count = 1 
        3 . we do the step 2 until the length of array 

            

 */

public class _185_Divide_And_Conquer_Question_2 {
    public static int majorityElement(int nums[]){
        
        int maximum_no = nums[0] ;
        int count = 1 ;

        for(int i = 1 ; i < nums.length ; i++){
            if( nums[i] == maximum_no ){
                count++;
            }
            else if(count > 0 ){
                count--;
            }else{
                maximum_no = nums[i];
                count = 1; 
            }
        }
        return maximum_no;

    }
    public static void main(String args[]){
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    
}