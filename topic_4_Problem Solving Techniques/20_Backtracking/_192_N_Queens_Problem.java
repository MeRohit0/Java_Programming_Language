/*
    Program for the N-Queens Problem 
        
        In this we have to place the n - queens to each line of square matrix of  n * n 

    we have only 3 types of problem 
        1. print all ways 
        2. Count total number of ways 
        3. print any one solution 


    1. print all ways 

        Approach - 

            Initialized the char[] array 
            println array function done 
        1. Search all the places where q can be placed 
        2. There we can check if we can place the Queen or not 
                if we don't place there then we will traverse till length  and backtrack 

    Time Complexity - O(n!)
    
    2. count total number of ways 
        Approach - 
            It is same but in base case we will increment the static variable 

    3. print any one solution 
        Approach -
    
 */

public class _192_N_Queens_Problem {
    
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
            printArr(arr);
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

    public static void printArr(char arr[][]){

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
        nQueens(arr,0);
        
    }
}
