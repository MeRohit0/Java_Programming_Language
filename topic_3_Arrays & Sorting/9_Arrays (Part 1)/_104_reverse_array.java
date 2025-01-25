/*
    reverse an array [1,2,3,4,5]  -->  [5,4,3,2,1]
    
    we have 2 approach 
    1.  we will create a new array and reverse the array and then assign the value 
        but this method will take more space and time i.e 
        time complexity is O(n)
        space complexity is O(n)

    2.  we will take start and end  pointer and swap the value it will take 
        time complixity is O(n/2) ~ O(n)
        space complexity is O(1)  for temp variables 
 */
public class _104_reverse_array {
    public static void reverse (int number []){
        int start = 0 ; 
        int end = number.length - 1;
        while( start < end ){
            //swap the left and right 
            int temp = number[start] ;
            number[start] = number[end];
            number[end] = temp ;
            // move left and right pointer closer to each other 
            start++; 
            end --;

        }
        
    }
    public static void main(String args[]){
        int arr[] = { 1 ,2, 4,6 ,7 ,8 ,23 };
        
        System.out.println("Before the swap");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        reverse(arr);
        System.out.println("After the swap");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
