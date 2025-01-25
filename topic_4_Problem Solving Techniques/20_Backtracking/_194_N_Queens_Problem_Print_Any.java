/*
    Program for the N-Queens Problem 
        3. print any one solution 
        ( see line number 46 ) 

    Time Complexity - O(n!)
    

    3. print any one solution 
        Approach - 
    
 */

 public class _194_N_Queens_Problem_Print_Any {
    
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

    public static boolean nQueens(char arr[][] , int row ){
        //base case 
        if(row == arr.length ){
            // printBoard(arr);
            return true;            //  return true for giving one solution 
        }
        //working 
        for (int col = 0; col < arr.length; col++) {

            if(isSafe(arr, row , col )){

                arr[row][col] = 'Q';
                if(nQueens(arr, row+1) == true){
                    return true;
                }  //function call
                arr[row][col] = '_';    //backtracking step
            }
        }
        return false;

    }

    public static void printBoard(char arr[][]){

        System.out.println("---------- new array ----------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    static int count = 0 ;
    public static void main(String[] args) {
        
        int n = 4;

        char arr[][] = new char[n][n];
        
        //initialize the array 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '_';
            }
        }
        
        if(nQueens(arr,0)){
            System.out.println("Solution is Present ");
            printBoard(arr);
        }else{
            System.out.println("Solution is not Present");
        }

        System.out.println("Total no of ways is : " + count );
        
    }
}
