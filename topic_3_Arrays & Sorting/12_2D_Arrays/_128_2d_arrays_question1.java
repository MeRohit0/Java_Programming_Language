/*
Question 1 : Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2

*/
public class _128_2d_arrays_question1 {
    
    public static void main(String args[]){
        // 2d array 
        int arr[][] = {{4,7,8},{8,8,7}};

        int countof7 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                if( arr[i][j] == 7 ){
                    countof7++;
                }
            }
        }
        System.out.println(countof7);
    }
}
