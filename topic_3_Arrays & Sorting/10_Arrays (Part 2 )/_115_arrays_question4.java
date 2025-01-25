/*
    Question 4 :
    Given n non-negative integers representing an elevation map 
    where the width of each bar is 1, compute how much water it can trap after raining.

    time complexity - O(n)
*/
public class _115_arrays_question4 {
    public static int raining(int arr[]){
        int size = arr.length;
        int leftmost[] = new int[size];
        int rightmost[] = new int[size];
        
        //calculate  leftmost and rightmost array 
        leftmost[0] = arr[0];

        for (int i = 1; i < size; i++) {
            leftmost[i] = Math.max( leftmost[i - 1] , arr[i]);
        }
        
        rightmost[size - 1 ] = arr[size - 1 ];

        for( int i = size - 2 ; i >= 0 ; i-- ){
            rightmost[i] = Math.max( rightmost[i + 1] , arr[i] ); 
        }
        

        //calculate trapwater 

        int boundary[] = new int[size];
        for (int i = 0 ; i < size ; i ++ ){
            boundary[i] = Math.min(leftmost[i] , rightmost[i]);
        }
        int trapwater = 0;
        for (int i = 0; i < size; i++) {
            trapwater += boundary[i] - arr[i] ;
        }

        if(trapwater < 0 ){
            trapwater = 0 ;
        }
        return trapwater ;
    }
    public static void main (String args[]){
        int arr[] = {4, 2, 0, 3, 2, 5} ;
        System.out.println("total water it can trap : " + raining(arr));
    }

}
