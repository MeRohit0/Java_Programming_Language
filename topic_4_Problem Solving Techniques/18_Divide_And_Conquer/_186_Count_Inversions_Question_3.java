/*
    Thanks to Striver (Raj)
    Program to count the inversions
    arr[] = [5,3,2,1,4]
 
    Find the count that hold the condition arr[i] > arr[j] and i<j;
    [5,3] , [5,2] , [5,1] , [5,4]
    [3,2] , [3,1] 
    [2,1] 

    Approach using the mergeSort 
        in arr[i] > arr[j] condition we increase the value of count++
    
    Time Complexity -O(n *logn)
    space Compelxity - O(n)


-----------              ----------------             -----------------             ------------

Question 3 : Given an array of integers. Find the Inversion Count in the array.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from
being sorted. If the array is already sorted then the inversion count is 0. If an array is
sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
Sample Output 1: 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).

Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
Sample Output 2: 0, because the array is already sorted

Sample Input 3: N = 3, arr[] = {5, 5, 5}
Sample Output 3 : 0, because all the elements of the array are the same & already in a sorted manner.

(Hint: A sorting algorithm will be used to solve this question.)

 */

public class _186_Count_Inversions_Question_3 {

    public static int merge(int arr[],int low,int mid,int high){
        
        int left = low ;
        int right = mid+1;
        int temp[] = new int[high - low + 1];
        int k = 0 ;
        int count = 0 ;         //it is for the merge count 

        while(left <= mid && right <= high){

            if( arr[left] <= arr[right] ){
                temp[k++] = arr[left++];
                
            }
            else{   //left is greater than right
                count += (mid - left + 1);          //here we count ++;
                temp[k++] = arr[right++];
                
            }
        }

        // if elements on the right half are still left
        while(left <= mid ){
            temp[k++] = arr[left++];
        }
        // if elements on the right half are still right
        while(right <= high ){
            temp[k++] = arr[right++];
        }
        // transfering all elements from temporary to arr
        for (int i = 0, j = low ; i < temp.length; i++ ,j++) {
            arr[j]  = temp[i];
        }
        return count ;
    }

    public static int mergeSort(int arr[] , int low , int high){
        int count = 0;
        if(low >= high){
            return count;
        }
        int mid = (low + high ) /2 ;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1 , high);
        count += merge(arr,low,mid,high);

        return count ;

    }
    //modified mergeSort method 2 
    public static int countInversions(int arr[] ){
        int n = arr.length - 1 ;
        return  mergeSort(arr, 0, n);
    }

    //bruteforce method 1
    public static int countInversionsbyBruteforce(int arr[] ){
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return  count;
    }
    public static void main (String args[]){
        int arr[] = {5,3,2,1,4};
        
        //bruteforce technique TC - O(n^2)
        System.out.println("By Bruteforce method count value is : " +countInversionsbyBruteforce(arr) );

        //modification in mergeSort 
        int count = countInversions(arr);
        System.out.println("By modified MergedSort method \n"+count);

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] +" ");
        }
    }
}
