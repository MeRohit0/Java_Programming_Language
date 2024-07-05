/*


Program for Print the subarrays 
- a subarray is a continuous part of array 

NOTE : Time complexity - O(n^3) n cube

    input - [1,4,5,7,10]
    output - 
    [1] , [1,4] , [1,4,5] , [1,4,5,7] , [1,4,5,7,10]
    [4] , [4,5] , [4,5,7] , [4,5,7,10]
    [5] , [5,7] , [5,7,10]
    [7] , [7,10]
    [10]

     

 */
public class _106_print_subarray {

    public static void printSubarrays(int number[]){
        int ts = 0 ;
        //for starting value 
        for(int i = 0 ; i < number.length ; i++){
            //for ending value 
            for(int j  = i ; j < number.length ; j++){
                //loop goes from i to j 
                for(int k = i ; k <= j ; k++){
                    System.out.print( number[k] + " ");
                }
                ts++;
                System.out.println(" ");
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
    }
    public static void main(String args[]){
        int arr[] = { 1, 2 , 3, 4, 5 };
        printSubarrays(arr);
    }
}
