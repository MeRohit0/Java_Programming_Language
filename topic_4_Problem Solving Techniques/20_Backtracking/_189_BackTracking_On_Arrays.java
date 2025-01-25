/*
    BackTracking is used for go back to previous step in recursion

    Its has Mainly 3 types in which we use them 

    1. Decision
    2. Optimization
    3. Enumeration (List all possible solution )

    BackTracking on Arrays 
    In this we have to assign value to an array like arr[5] = {1,2,3,4,5} and then print it 
    and then subtract the -2 from its value array current value {-1,0,1,2,3}

 */
public class _189_BackTracking_On_Arrays  {
    public static void chanArr(int arr[] , int i , int value ){
        //base case 
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //workingS
        arr[i] = value ;
        chanArr(arr, i+1, value + 1 );      //function call or recursion call 
        arr[i] -= 2;    //backtracking step
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // new array 
        int arr[] = new int[5];
        chanArr(arr, 0 , 1 );
        printArr(arr);
    }
    
}
