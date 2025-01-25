/*
    linear search on the array 
    its time complixity is 
    worst time : O(n)
    best time : O(1);

 */
public class _100_linearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] == key ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,7,2,9,12,46,13};
        int key = 123;
        int found = linearSearch(arr, key);
        if(found == -1 ){
            System.out.println("Not found in the list ");
        }else{
            System.out.println("Found at index : " + found );
        }
    }
    
}
