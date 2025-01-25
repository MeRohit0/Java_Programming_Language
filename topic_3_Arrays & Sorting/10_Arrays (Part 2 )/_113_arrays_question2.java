/*
Question 2:

    There is an integer array nums sorted in ascending order (with distinct values).
    Prior to being passed to your function, nums is possibly rotated at an 
    unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting
    array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,
    nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might be rotated 
    at pivot index 3 and become [4,5,6,7,0,1,2].
    Given the array nums after the possible rotation and an integer target,
    return the index of target if it is in nums, or -1 if it is not in nums.
    
    You must write an algorithm with O(log n) runtime complexity


    algo 
    
    input = {4, 5, 6, 7, 0, 1, 2} , target ;
    output = present or not ;

    step 1. find the k value (using binary search but conditions are alter )
    step 2. search on left and right subarray
    step 3. using binary search 
*/
public class _113_arrays_question2 {

    //find value of k 
    
    public static int minvalue( int arr[] ){
        int left = 0 ;
        int right = arr.length - 1 ;
        int mid = 0;

        while(left <= right ){
            mid = (left + right ) / 2 ;
            if( arr[mid] < arr[mid - 1] ){
                return mid ;
            }
            else if ( arr[mid] > arr[left ]  && arr[mid] > arr[right]){
                left = mid + 1;
            }else {
                right =  mid - 1;
            } 
        }
        return mid;
    }

    //search on array 
    public static int subarraySearch( int arr[] , int  mid ,int target  ){
        int leftsearch = binarySearch(arr, 0, mid - 1, target );
        int rightSearch = binarySearch(arr, mid , arr.length - 1, target);
        
        if(leftsearch != -1 ){
            return leftsearch;
        }else if (rightSearch != -1){
            return rightSearch; 
        }
        return -1 ;
    }



    public static int binarySearch(int arr[] ,int left , int right , int target){
        //pass ascending order 
        
        while( left <= right ) {
            int mid = (left + right ) / 2 ;
            
            if ( arr[mid] == target){
                return mid ;
            }
            else if ( arr[mid] > target){
                right = mid - 1 ;
            }
            else{
                left = mid +1 ;
            }
        }
        return -1 ;
    }

    public static int inverted_arr(int arr[] , int target){
        int mid = minvalue(arr);
        int find = subarraySearch(arr, mid, target);
        return find ;
    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        
        int present = inverted_arr(arr, 3);
        if (present == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at : " + present);
        }
    }
}
