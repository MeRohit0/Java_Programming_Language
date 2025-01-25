/*

Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18

 */
public class _129_2d_arrays_question2 {
    public static void main(String args[]){
        // sum of number from second row 
        int sum = 0 ;
        int nums[][] = {{1,4,9}, {11,4,3},{2,2,3}};

        for(int i = 0 ; i < nums[1].length ; i ++){
            sum += nums[1][i];
        }
        System.out.println(sum);

    }
}
