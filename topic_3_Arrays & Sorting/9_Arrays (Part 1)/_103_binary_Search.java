/*
        Binanry Search in array 
        
        input   - sorted array (assending order) , target or key 
        output  - return index or -1 not found 

        Time Complexity is O(log n )

        let size of input (n) = 8 
        
        iteration 1     8
        iteration 2     4
        iteration 3     2
        iteration 4     1
        
 */
public class _103_binary_Search {
    public static int binarySearch(int arr[] , int key ){
        int left = 0;
        int right = arr.length - 1 ;
        while( left <=  right ){
            int mid = (left + right ) / 2 ;
            
            if( arr[mid] == key ){
                return mid;
            }else if (arr[mid] > key){
                right = mid - 1 ; 
            }else {
                left = mid + 1 ;
            }
        }
        return -1 ;
    }
    public static void main (String args[]){
        int arr[] = {1,5,7,9,14,19,27,37,55,69,97};
        
        //  int arr1[] = {97,69,55,37,27,24,22,19,14,9,7,5,1};

        int found = binarySearch(arr, 19);
        if (found == -1 ) {
            System.out.println("Item not found ");
        }else{
            System.out.println("Item at index : " + found );
        }

    }
}
