/*
    Program to find the last occurence of an element in an array 
        arr[] = {8 , 3 ,6 ,9 , 5, 10, 2, 5, 3}
 */
public class _170_Last_Occurrence_In_Array {
    

    public static int  lastOcc(int arr[] , int key , int i ){
        if(i < 0 ){
            return -1;
        }
        if( arr[i] == key ){
            return i ; 
        }
        return lastOcc(arr, key, i - 1);
    }

    //reduce the parameter
    public static int  lastOcc(int arr[] , int key ){
        int i = arr.length - 1;
        return lastOcc(arr , key , i );
    }

    //Method 2 : its use the approach first see forward and then check if i is equal to key 
    public static int lastOcc2(int arr[] , int key , int i ){
        if(i == arr.length ){
            return -1;
        }
        int isFound = lastOcc2(arr, key , i+1);
        if(isFound == -1 && arr[i] == key ){
            return i ;
        }

        return isFound ;
    }
    
    public static void main (String args[]){
        int arr[] = {8 , 3 ,6 ,9 , 5, 10, 2, 5, 3};

        //lastOcc function 
        int value2 = lastOcc2(arr, 5 , 0);
        if( value2 == -1  ){
            System.out.println("Element not present");
        }else{
            System.out.println("Element present at index : "+value2);
        }
        
    }
}
