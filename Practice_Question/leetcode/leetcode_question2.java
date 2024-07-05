package Practice_Question.leetcode;
/*
 * 922. Sort Array By Parity II

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

 

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 
 * 
*/
public class leetcode_question2 {

    //input & output --> array 

    public static void printarr(int nums[]){
         //print arr
         for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + "  ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        //array
        int nums[] = {4,2,5,7};
        //half loop 
        for(int i = 0 ; i < nums.length/2 ; i++){
            //even and odd index 
            int even_index = 2 * i ;
            int odd_index = 2 * i + 1;
            //even index value check
            if( nums[even_index] % 2 != 0  ){
                int temp = odd_index;
                do{
                    if(nums[temp] % 2 == 0 ){
                        //swap 
                        int temp2  = nums[even_index] ;
                        nums[even_index] = nums[temp];
                        nums[temp] = temp2 ;
                        break;
                    }
                    else{
                        temp += 2;
                    }
                }while( temp < nums.length );
            }
            //odd index value check 
            if( nums[odd_index] % 2 == 0  ){
                int temp = even_index;
                do{
                    if(nums[temp] % 2 != 0 ){
                        //swap 
                        int temp2  = nums[odd_index] ;
                        nums[odd_index] = nums[temp];
                        nums[temp] = temp2 ;
                        break;
                    }
                    else{
                        temp += 2;
                    }
                }while( temp < nums.length );
            }
            
        }
        printarr(nums);
    }
}

