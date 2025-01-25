/*
    Program to print the sudoku solver 

        Sudoku of 9 * 9 
        
        sCol
          ^                  ^                ^
          |                  |                |
        --------------------------------------------------
sRow -->| 0 | 0 | 8     ||   0 | 0 | 0    ||   0 | 0 | 0 |
        
        | 4 | 9 | 0     ||   1 | 5 | 7    ||   0 | 0 | 2 |
        
        | 0 | 0 | 3     ||   0 | 0 | 4    ||   1 | 9 | 0 |
        ==================================================
        | 1 | 8 | 5     ||   0 | 6 | 0    ||   0 | 2 | 0 |
        
        | 0 | 0 | 0     ||   0 | 2 | 0    ||   0 | 6 | 0 |
        
        | 9 | 6 | 0     ||   4 | 0 | 5    ||   3 | 0 | 0 |
        ==================================================
        | 0 | 3 | 0     ||   0 | 7 | 2    ||   0 | 0 | 4 |
        
        | 0 | 4 | 9     ||   0 | 3 | 0    ||   0 | 5 | 7 |
        
        | 8 | 2 | 0     ||   0 | 0 | 9    ||   0 | 1 | 3 |
        --------------------------------------------------
    
    Approach - 
        1. Start from first row and first coloumn 
        2. if there is no number then we will place number from 1-9 after check the isSafe function
        3. isSafe will give true then we will place the selected number from 1- 9
        4. Move to next cell until col is end and then move to next row 
        5. if we get the end then we will return true to get only 1 solution 

    
 */
public class _196_Sudoku {

    public static boolean isSafe(int sudoku[][] , int row ,int col , int num ){
        
        //horizontal check 
        for (int i = 0; i < 9; i++) {
            if(sudoku[row][i] == num ){
                return  false ;
            }
        }
        // vertical check
        for (int i = 0; i < 9; i++) {
            if(sudoku[i][col] == num ){
                return  false ;
            }
            
        }
        //check in the sub sudoku
        //find starting row and starting col
        int sRow = (row / 3 ) * 3 ;
        int sCol = ( col / 3) * 3 ;
        for(int i = sRow ; i < sRow+3 ;i++){
            for (int j = sCol; j < sCol+3; j++) {
                if(sudoku[i][j] == num ){
                    return false ;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][] , int row , int col){
        //base case 
        if(row == 9){
            return true;
        }
        //working recursion 
        int nextRow = row ;
        int nextCol = col +1;
        if(col+1 == 9 ){
            nextRow = row +1 ;
            nextCol = 0 ;
        }
        if(sudoku[row][col] != 0 ){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
            for(int num = 1 ; num <= 9 ; num++){
        
                if(isSafe(sudoku , row , col , num)){
                    
                    sudoku[row][col] = num;
                    if(sudokuSolver(sudoku , nextRow , nextCol) == true){
                        ndfn++;
                        return true;
                    }
                    sudoku[row][col] = 0;
                }
            }
        

        return false ;

    }
    public static void printSudoku(int sudoku[][]){
        System.out.println("---------- new array ------------");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }System.out.println();
        }
    }
    static int ndfn= 0 ;
    public static void main(String args[]){
        int sudoku[][] = {
        {0 , 0 , 8 , 0 , 0 , 0 , 0 , 0 , 0},
        {4 , 9 , 0 , 1 , 5 , 7 , 0 , 0 , 2},
        {0 , 0 , 3 , 0 , 0 , 4 , 1 , 9 , 0},
        {1 , 8 , 5 , 0 , 6 , 0 , 0 , 2 , 0},
        {0 , 0 , 0 , 0 , 2 , 0 , 0 , 6 , 0},
        {9 , 6 , 0 , 4 , 0 , 5 , 3 , 0 , 0},
        {0 , 3 , 0 , 0 , 7 , 2 , 0 , 0 , 4},
        {0 , 4 , 9 , 0 , 3 , 0 , 0 , 5 , 7},
        {8 , 2 , 0 , 0 , 0 , 9 , 0 , 1 , 3} };
        
        sudokuSolver(sudoku, 0, 0);
        // printSudoku(sudoku);
        System.out.println(ndfn);

    }
}
