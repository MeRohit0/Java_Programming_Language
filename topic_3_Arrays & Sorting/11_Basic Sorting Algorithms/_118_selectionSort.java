/*
    selection sort 
    
    [ sorted array | unsorted array ]
    find the smallest number from array and place it in front (sorted array )

    time complexity is O( n ^ 2 )

*/

public class _118_selectionSort {
    public static void selectionSort(int arr[]){

        //here we optimize by sub - 1 from loop condition 
        for ( int i = 0 ; i < arr.length - 1  ; i++ ){
            int min = i ;
            //here we optimised by increment the value of j 
            for (int j = i+1  ; j < arr.length  ; j++){
                if( arr[min] > arr[j]){
                    min = j ;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        //print array
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " "); 
        }

    }
    public static void main(String args[]){
        int arr[] = {4,1,5,2,3};
        selectionSort(arr);
    }
}
