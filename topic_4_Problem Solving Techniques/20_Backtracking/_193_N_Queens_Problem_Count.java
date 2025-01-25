/*
    Program for the N-Queens Problem 
        2. Count total number of ways 
        ( see line number 44 )

        Time Complexity - O(n!)
    
    2. count total number of ways 
        Approach - 
            It is same but in base case we will increment the static variable 
    
 */

 public class _193_N_Queens_Problem_Count {
    
    public static boolean isSafe(char board[][] , int row , int col ){
        //check in upper direction 
        for(int i = row -1  ; i >= 0 ; i--){
            if(board[i][col] == 'Q' ){
                return false ;
            }
        }

        //check diagonal upper left 
        for (int i = row - 1 , j = col - 1;  i >= 0 && j >=0 ; i-- , j-- ) {
            if(board[ i ][ j ] == 'Q'){
                return false;
            }
        }      
        //check diagonal upper right
        for(int i = row - 1 , j = col + 1 ; i >= 0 && j < board.length ; i -- , j ++){
            if( board[i][j] == 'Q'){
                return false;
            }
        }
        
        return true;
        
    }

    public static void nQueens(char arr[][] , int row ){
        //base case 
        if(row == arr.length ){
            // printArr(arr);
            count++;        // count the number of ways ;
            return ;
        }
        //working 
        for (int col = 0; col < arr.length; col++) {

            if(isSafe(arr, row , col )){

                arr[row][col] = 'Q';
                nQueens(arr, row+1);  //function call
                arr[row][col] = '_';    //backtracking step
            }
        }

    }

    public static void printBoard(char arr[][]){

        System.out.println("---------- new array ----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    static int count = 0 ;  //static variable 
    public static void main(String[] args) {
        
        int n = 10;

        char arr[][] = new char[n][n];
        
        //initialize the array 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '_';
            }
        }
        nQueens(arr,0);
        System.out.println("Total no of ways is for n = "+ n+" is " + count );
        
    }
}
