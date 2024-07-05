/*
    sorting is used to arrange things in order
    
    bubble sort 
    traversed from left to right is compare the adjacent element 
    and the higher one is placed on right side 
    
    It is inspired from the boiling water

    time complexity - O(n ^ 2 )n square 
 */
public class _117_bubbleSort {
    
    public static void bubbleSort(int arr[]){
        
        for( int turn = 0 ; turn < arr.length ; turn ++ ){
            for( int j = 0 ; j < arr.length - 1 - turn ; j ++ ){
                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        //print array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[] = {1,3,5,2,4};
        bubbleSort(arr);
    }
    
}
