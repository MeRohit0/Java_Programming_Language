/*
    countingsort   
    it is used to sort the element which are in large volume but there range is small 
    example - [1,1,3,3,4,5,3,3,2,2,6,4,4,3,4,5,2,2,4,5,3,5] here number range is from 1 to 6 

    they are mainly used for positive numbers which include 0 zero also 

    time complexity - O( n + range )
    
 */
public class _121_countingSort {
    public static void countSort(int arr[]){
        
        //find max number i.e. range 
        int maxnum = Integer.MIN_VALUE ; 
        for(int i = 0 ; i < arr.length ; i++){
            maxnum = Integer.max( maxnum , arr[i] );
        } 
        //create count array
        int countarr[] = new int[maxnum + 1 ]; 
        for(int i = 0 ; i < arr.length ; i ++ ){
            countarr[arr[i]] ++ ; 
        }
        //sort the array (assending order )
        int index = 0;
        for(int i = 0 ; i < countarr.length ; i ++ ){ 
            while( countarr[i] > 0 ){
                arr[index] = i;
                index ++ ;
                countarr[i] --;
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,3,4,4,4,2,3,5,5,5,5,4};
        countSort(arr);
        printarr(arr);
    }

}
