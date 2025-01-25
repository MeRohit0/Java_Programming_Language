/*
    insertionSort 
    [ sorted array , unsorted array ]
    
    example - arrange the cards in  deck of cards via insert the card from unsorted regin to sorted region  

    step 1 : we select the next element from unsorted array 
    step 2 : insert it into correct place in sorted array 

    time complexity - O(n ^ 2 ) n square
    
 */
public class _119_insertionSort {
    public static void insertionSort(int arr[]){
        
        for( int i = 1 ; i < arr.length ; i++ ){
            //store the value 
            int curr = arr[ i ] ;
            int prev = i - 1  ;
            //find the correct postion to insert
            while (  prev >= 0 && arr[prev] > curr   ){
                arr[prev + 1 ] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1 ] = curr ; 
        
        }

        //print array
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {5,3,2,4,1};
        insertionSort(arr);
    }
}
