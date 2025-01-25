/*
    largest in array

    initialized with minus infinity  
    
 */

public class _102_largest_in_Array {
    
    public static int getLargest(int arr[]){
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE ;
        
        System.out.println(largest);    //print the MAX_VALUE 
        System.out.println(smallest);   //print the MIN_VALUE 
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if ((arr[i]) > largest ){
                largest = arr[i];
            }

            if ((arr[i]) < smallest ){
                smallest = arr[i];
            }
                
        }
        System.out.println("Smallest number is : " + smallest);
        return largest ;
    }

    public static void main (String args[]){
        int arr[] = {1,5,2,73,15,82,2,62,72,7,32,};
        int ans = getLargest(arr);
        System.out.println("Largest number is : " + ans);
    }
}

