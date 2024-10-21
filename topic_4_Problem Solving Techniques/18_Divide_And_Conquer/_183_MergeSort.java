/*
    Program for the merge sort 

    It is based on Divide & Conquer Technique 
    first divide the array and then merge the array 

    Time complexity - O(n log n)
    Space Complexity - O( n )

   Approach 
    1 . divide the arr by mid value 
    2 . mergeSort for left and right array {into single element array }
    3 . copy value to original array with temp array 

    arr - > [6,3,9,5,2,8]

    [6,3,9]         [5,2,8]

 */
public class _183_MergeSort {
    public static void printarr(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[] ,int start ,int mid , int end  ){

        // 2 . mergeSort for left and right array { into single element array }

        int temp[] = new int[ end - start + 1  ];
        int i = start;
        int j = mid + 1 ; 
        int k = 0;
        while( i <= mid && j <= end  ){
        
            if( arr[i] < arr[j] ){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++ ; 
            }
            k++;
        }
        //copy directly value to the temp array

        while( i <= mid ){
            temp[k] = arr[i];
            i++; 
            k++;
        }

        while( j <= end ){
            temp[k] = arr[j];
            j++; 
            k++;
        }

        //now copy the temp arr to original arr
        for(k = 0 ,i = start ; k < temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(int arr[] , int start , int end  ){
        //base case 
        if( start >= end  ){
            return ; 
        }
        //working of mergeSort 

        // 1 . divide the arr by mid value 
        int  mid = start + ( end - start )/ 2 ;

        //left array  //right array ( Divide ) 
        mergeSort(arr , start , mid );
        mergeSort(arr, mid+1, end );
        
        
        // 2 . call the mergeSort for left and right array {into single element array } (conquer)
        merge(arr , start , mid, end );

        
    }
    public static void main (String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort( arr, 0, arr.length - 1 );
        printarr(arr);
    }
    
}
