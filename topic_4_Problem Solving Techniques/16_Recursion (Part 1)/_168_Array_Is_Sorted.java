/*
    Program to check if array is sorted or not 
        [1,2,3,4,5]

        approach 
        - check the i'th element with (i+1) 

        time complexity - O(n)
 */
public class _168_Array_Is_Sorted {
    public static boolean isSorted(int arr[] , int i ){
        
        if( i == arr.length-1 ){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1);
    }
    public static void main(String args[]){
        int n[] = {2,1};
        // String value = ()?"Yes":"No";
        System.out.println(isSorted(n,0));

    }
}
