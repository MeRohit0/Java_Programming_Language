/*
    Program to print the Rat in a Maze

NOTE  : Check the line number 31 and 53 as main 

    You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)
    (the maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a
    square matrix of order N * N where the cells with value 0 represent the maze’s blocked
    locations while value 1 is the open /available path that the rat can take to reach its destination.
    
    The rat's destination is at (N - 1, N - 1).
    
    Your task is to find all the possible paths that the rat can take to reach from source to
    destination in the maze.

    The possible directions that it can take to move in the maze are 
        1. (Up)    'U' ( i - 1 , j )
        2. (Down)  'D' ( i + 1 , j )
        3. (left)  'L' ( i , j - 1 )
        4. (Right) 'R' ( i , j + 1 )

        time complexity - O( 4 ^ n)
        space complexity - O( n + m );

    
 */
public class _197_Backtracking_Question_1_Rat_In_A_Maze {
    public static void FindAllPaths(int i , int j , int n , int arr[][] ,boolean visited[][] , String str){

        //base case 
        if(i < 0 || j < 0 || i >= n || j >= n ){
            return ;
        }

        if(visited[i][j] == true || arr[i][j] == 0){        // check the value of arr[i][j] == 0 then return 
            return ;
        }

        if(i == n - 1 && j == n - 1 ){
            //print arr
            System.out.println("The path is " + str);
            return ;
        }

        visited[i][j] = true;

        //working 
        //up
        FindAllPaths(i - 1 , j, n, arr , visited , str + "U");
        //down
        FindAllPaths(i + 1 , j, n, arr , visited , str + "D");
        //left
        FindAllPaths(i , j - 1 , n, arr , visited , str + "L");
        //right
        FindAllPaths(i  , j + 1, n, arr , visited , str + "R");

        visited[i][j] = false;      //backtracking 
    }
    public static void main(String[] args) {

        int maze[][] = {
                    {1,1,1,0,1},
                    {1,0,1,0,1},
                    {1,1,1,1,1},
                    {1,0,1,0,1},
                    {1,1,1,0,1}};

        int n = maze.length;
        FindAllPaths(0, 0, n, maze, new boolean[n][n], "");
    }
}
