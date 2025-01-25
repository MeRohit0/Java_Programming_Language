package Practice_Question.leetcode;
/*
Given an integer array nums, move all the even integers at the beginning of the array followed 
by all the odd integers.

Return any array that satisfies this condition.

 time complexity -- O( n^2)


Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

approch 

time complexity - O( n )

*/


public class leetcode_question {
    public static void main(String[] args) {
        int num[] = {3,1,2,4};
        int i= 0 ;
        int j;
        for(j = 0 ; j < num.length ; j ++){
            if(num[j]% 2 == 0 ){

                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;

                i++;
            }
        }
        for (j = 0; j < num.length; j++) {
            System.out.print(num[j] + "  ");
        }
        System.out.println();
    }
        
}



