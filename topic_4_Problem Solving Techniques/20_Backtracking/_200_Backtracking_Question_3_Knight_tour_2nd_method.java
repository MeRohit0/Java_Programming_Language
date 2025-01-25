/*
    2nd method of knigh't tours

NOTE - see the line number 71 for not operator 

    Time Complexity - O(8 ^ (n ^ 2))
    Space Complexity - O(n * n )

 */
public class _200_Backtracking_Question_3_Knight_tour_2nd_method {
    
    static boolean isSafe(int x , int y , int arr[][]){
        //this check the possible case 
        return (x >= 0 && y >= 0 && x < arr.length && y < arr.length && arr[x][y] == -1 );
    }
    
    static boolean knightUtil(int x , int y , int count, int xMoves[] , int yMoves[] , int arr[][] ){
        
        int n = arr.length;
        if(count == n * n ){
            return true;
        }
        int nextX , nextY ;
        
        //we check all the 8 recursion call 
        for (int i = 0; i < 8; i++) {
            
            nextX = x + xMoves[i];
            nextY = y + yMoves[i];
            if( isSafe(nextX, nextY, arr) ){
                
                arr[nextX][nextY] = count ;
                if(knightUtil(nextX, nextY,count + 1, xMoves, yMoves, arr)){    // this will only print the single array 
                    return true;
                }else {
                    arr[nextX][nextY] = -1 ;    //backtracking in case we don't get the answer 
                }
            }

        }
        return false ;

    }

    static void knight(){
        
        int arr[][] = new int[8][8];
        
        //initialize the array with -1 we don't visit the cell 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -1;
            }
        }

        //below order of array give ans but take more time for recursion
        // int xMoves[] = { -2,-2, 2,  2, -1,  1, -1, 1};
        // int yMoves[] = { -1, 1, -1, 1, -2, -2,  2, 2};

        int xMoves[] = { -2,-1, 1, 2,  2,  1, -1, -2};  //these values are stored in array 
        int yMoves[] = {  1, 2, 2, 1, -1, -2, -2, -1};



        //starting point 
        arr[0][0] = 0 ; 

        //we include the starting point and increase the count
        if( ! (knightUtil( 0 , 0  ,1, xMoves ,  yMoves ,  arr ) ) ){    // check the not operator here 
            System.out.println("solution does not exist");
        }
        else{
            printboard(arr);
        }

    }
    //print the array 
    static void printboard(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        //we call the knight function 
        knight();
    }
}
