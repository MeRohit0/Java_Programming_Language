/*

program for max subarray sum  
calculate the max sum of subarray and print the max value of sum

NOTE :  Time Complexity --> O(n ^ 3 ) n cube 
        space Complexity --> O(n)

    [1,2,3,4,5]  
    
    subarray                                            sum of sumarrays

    [1] , [1,2], [1,2,3] , [1,2,3,4] , [1,2,3,4,5]      [1 , 3 , 6 , 10 , 15]
    [2] , [2,3] , [2,3,4] , [2,3,4,5]                   [2,5,9,14]
    [3] , [3,4] , [3,4,5]                               [3,7,13]
    [4] , [4,5]                                         [4,9]
    [5]                                                 [5]

    
 */
public class _107_max_subarray_sum1_brute_force {
    public static void printSubarray(int arr[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i; j < arr.length; j++) {
                
                currSum = 0;
                
                for (int k = i; k <= j; k++) {
                    currSum += arr[k] ;
                }
                System.out.print(currSum + " ");
                if (currSum > maxSum) {
                    maxSum = currSum ;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum of array is : " + maxSum);
    }
    public static void main(String args[]){
        int number[] = {2,4,6,8, 10};
        int number1[] = {1,-2,6,-1, 3};
        System.out.println("max Sum of first number is : ");
        printSubarray(number);  
        System.out.println("max Sum of second number is : ");
        printSubarray(number1);  
    }
}
