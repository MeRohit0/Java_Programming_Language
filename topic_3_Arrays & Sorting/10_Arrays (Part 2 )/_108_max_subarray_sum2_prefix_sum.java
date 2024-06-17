/*
    program for max sum of subarray using prefix array

    step 1 : In this we will first create a prefix array which has 
                sum of all integers including its own index number 

    step 2 : we will use prefix array to find the sum of max number 
                this will result in decrease in time complexity 
    

NOTE :  Time Complexity --> O(n ^ 2 ) n square 
        space Complexity --> O(n)


 */
public class _108_max_subarray_sum2_prefix_sum {
    
    public static void maxSubarraySum(int number []){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE ; 
        int prefix[] = new int[number.length];

        //calculate prefix array 
        // prefix[0] = number[0];  // second method 

        for(  int i = 0 ; i < prefix.length ; i++  ){
            //ternery operator 
            prefix[i] = ( i == 0 ) ? number[i] : prefix[ i - 1 ] + number[i];
            // prefix [ i ] = prefix [i - 1 ] + number [i];
        }
        
        
        // sum of max subarray sum using prefix array 
        for (int start = 0; start < prefix.length; start++) {
            
            for (int end = start; end < prefix.length; end++) {
                
                //ternary operator end - (start - 1 )
                currSum = (start == 0) ? number[start] :prefix[end] - prefix[start - 1];
            
            }
            if (currSum > maxSum) {
                maxSum = currSum ;
            }
        }
        System.out.println("sum of max subarrays is : " + maxSum);

    }
    public static void main (String args[]){
        int arr[] = {1 ,-1, 6 , -1 , 3};
        maxSubarraySum(arr);
    }
    
}
