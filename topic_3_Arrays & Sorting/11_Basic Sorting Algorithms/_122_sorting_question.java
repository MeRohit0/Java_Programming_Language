/*
    sorting question 
    
    Question :Use the following sorting algorithms tosort an array in DESCENDING order :
    a.Bubble Sort
    b.Selection Sort
    c.Insertion Sort
    d.Counting Sort
    You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

 */

class _122_Sorting_Question{

    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    
    public static void bubbleSort(int arr[]){
        //outer loop 0 to n - 1
        int size = arr.length ;
        for (int i = 0 ; i < size - 1 ; i ++){
            //inner loop compare 0 to (n - outerloop) 
            for( int j = 0 ; j < size - i - 1 ; j++ ) {
                if( arr[j] < arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
    }
    
    public static void selectionSort(int arr[]){

        for(int i = 0 ;i < arr.length ;i ++){
            int max = i;

            for(int j = i+1 ; j < arr.length ; j ++ ){
                if( arr[max] < arr[j] ){
                    max = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

        }
    }

    public static void insertionSort(int arr[]){// [1,2,3,4,5]
        //sorted and unsorted array 
        for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i - 1 ;
            //find the correct postion to insert 
            while(prev >= 0 && arr[prev] < curr){
                //swap 
                arr[prev + 1] = arr[prev] ;
                prev--;
            }
            //insertion
            arr[prev + 1] = curr ; 
    
        }

    }
    
    public static void countingSort(int arr[]){ // [1,2,3,4,5,6,7]
        
        //find max
        int max = Integer.MIN_VALUE ;  
        for (int i = 0 ; i < arr.length  ; i++){
            max = Integer.max(max , arr[i]);
        }
        //countarr[]
        int countarr[] = new int[max + 1];
        for(int i = 0 ; i < arr.length ; i++){
            countarr[arr[i]]++;
        }
        //arrange array
        int index = 0 ; 
        for(int i = countarr.length - 2 ; i > 0  ; i++ ){
            while(countarr[i] > 0 ){

                arr[index] = i;
                countarr[i]--;
                index++;
            }
        }

    }
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5,6,7,8};
        int arr3[] = {1,2,3,4,5,6,7,8,9,10};
        int arr4[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        bubbleSort(arr1);
        printarr(arr1);
        selectionSort(arr2);
        printarr(arr2);

        insertionSort(arr3);
        printarr(arr3);
        countingSort(arr4);
        printarr(arr4);

    }
}