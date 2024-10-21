/*
    Program to find the first occurence of an element in an array 
        arr[] = {8 , 3 ,6 ,9 , 5, 10, 2, 5, 3}

 */
public class _169_First_Occurrence_In_Array {

    public static int firstOcc(int arr[] , int key , int i ){
        
        if(i == arr.length ){
            return -1;
        }

        if(arr[i] == key ){
            return i;
        }
        return firstOcc(arr, key, i+1);
        
    }
    //reduce the parameter
    public static int firstOcc(int arr[] , int key ){
        int i = 0;
        return firstOcc(arr , key , i  );
    }

    public static void main (String args[]){
        int arr[] = {8 , 3 ,6 ,9 , 5, 10, 2, 5, 3};

        // firstOcc function
        int value = firstOcc(arr, 5);
        if( value == -1  ){
            System.out.println("Element not present");
        }else{
            System.out.println("Element present at index : "+value);
        }
        
    }
}
