/*
    Kadane's Algorithm 

    Time complexity - O(n)

    NOTE : if negative number is obtain then replace this with zero 

    step 1 : initialize the varable 
                currsum = 0 and maxsum = -infinity
    
    step 2 : iterate each element of array 
                
                a   currsum = currsum + array[i]  
                b   if(currsum > maxsum) 
                        maxsum = currsum
                a   if(currsum < 0 )
                        currsum = 0

                
    step 3  : if all the element are negative 
                print maxsum 

    
    
 */


public class _109_max_subarray_sum3_kadane_s_algo {
    
    public static void maxSub_arraySum(int arr[]){

        //initialize
        int currsum = 0 , maxsum = Integer.MIN_VALUE;

        //iterate 
        for (int i = 0; i < arr.length; i++) {
        
            currsum = currsum + arr[i];
            if(maxsum < currsum ){
                maxsum = currsum;
            }
            if(currsum < 0 ){
                currsum = 0 ;
            }

        }
        System.out.println("maxsubarray is : " + maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {-21 ,-2 ,-6 ,-4,-2 ,-3};
        maxSub_arraySum(arr);
    }
}

