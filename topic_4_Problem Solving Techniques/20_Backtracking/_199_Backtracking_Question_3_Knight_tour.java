/*
Question 3 :
Knight’s Tour
    Given a N*N board with the Knight placed on the first block of an empty board. 
    Moving according to rules of chess,knights must visit each square exactly once.
    Print the order of each cell in which they are visited.

    Time complexity - O(8 ^ ( n ^ 2 ))
    Space complexity - O(n ^ 2 )


NOTE - Check the 2nd method of this solution from the assignment solution pdf

 */
public class _199_Backtracking_Question_3_Knight_tour {
    public static void knightPaths(int i , int j , int n , int arr[][], int count ){
        //base case 
        if(i < 0 || j < 0 || i >= n || j >= n ){
            return ;
        }
        if(arr[i][j] != -1 ){ // we have been at this point before 
            return ;
        }
        

        arr[i][j] = count ;

        if(count == n*n -1){
            //print 
            System.out.println("------ array -------");
            for (int x = 0; x < n ; x++) {
                for (int y = 0; y < n; y++) {
                    System.out.print(arr[x][y] + " ");
                }System.out.println();
            }
            arr[i][j] = -1;
            return ;
        }
        //working 
            

        //top left and right 
        knightPaths(i-2 , j - 1 ,n,arr , count + 1 );
        knightPaths(i-2 , j + 1 ,n,arr , count + 1 );
        //bottom left and right 
        knightPaths(i + 2 , j - 1 ,n,arr , count + 1 );
        knightPaths(i + 2 , j + 1 ,n,arr , count + 1 );
        //leftside upper and lower 
        knightPaths(i-1 , j - 2 ,n,arr , count + 1 );
        knightPaths(i+1 , j - 2 ,n,arr , count + 1 );
        // rightside upper and lower
        knightPaths(i-1 , j + 2 ,n,arr , count + 1 );
        knightPaths(i+1 , j + 2 ,n,arr , count + 1 );

        // knightPaths(i - 2, j + 1, n, arr, count + 1);
        // knightPaths(i - 1, j + 2, n, arr, count + 1);
        // knightPaths(i + 1, j + 2, n, arr, count + 1);
        // knightPaths(i + 2, j + 1, n, arr, count + 1);
        // knightPaths(i + 2, j - 1, n, arr, count + 1);
        // knightPaths(i + 1, j - 2, n, arr, count + 1);
        // knightPaths(i - 1, j - 2, n, arr, count + 1);
        // knightPaths(i - 2, j - 1, n, arr, count + 1);

        arr[i][j] = -1;

    }
    public static void main(String[] args) {

        int arr[][] = new int[5][5];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -1;
            }
        }
        //  we have take array size 5 because size 8 is taking way to much time 
        knightPaths(0, 0, n, arr, 0 );  
    

    }
    
}
