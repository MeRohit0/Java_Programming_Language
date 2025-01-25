/*
    Program to count the number of ways to reach from (0,0) to (n-1,m-1)
        Rule : it is only allowed to move downwards and right direction

        Approach - 
            1. we will count the total no of way its previous cells will have from right and downward
                from base cell (n-1,m-1) 
            2. like base case at target cell we have 1 way to reach from target cell to target cell 
            3. and out of bound will have 0 way to reach from there to target 
    
    for  n = 3 
        |  a  |  b  |  c  |                 | [3+3]  | [1+2]  | [0+1]  |        notation
        |  d  |  e  |  f  |                 | [2+1]  | [1+1]  | [0+1]  |        [right + down]
        |  g  |  h  |  i  |                 | [1+0]  | [1+0]  | [1]    |

        total number of way to reach from cell a to cell i is : 6

        Time complexity - O( 2 ^(n+m)) exponential time complexity 
        Space Complexity - O(n+m)

    Trick solution is using the permutation method 
        Time complexity - O(n)
    
        Approach -
            -  we have different ways to arrange the direction like RRDD we have remove the 
                duplicates therefore we remove using permutation 

            -  like n -1  downwards and m -1 rightwwards 
                (n-1 +m -1 )! / (n-1)! * (m-1)!

 */
public class _195_Grid_Ways {
    public static int gridWays(int row , int col , int n , int m ){
        if(row == n - 1 && col == m - 1  ){
            return 1;
        }
        else if(row >= n || col >= m ){
            return 0 ;
        }

        int rightway = gridWays(row, col+1, n, m);
        int downway = gridWays(row+1,col , n,m);
        
        return rightway+downway;
    }


    // 2nd Method to solve the problem in TC -O(n)
    public static int factorial(int n ){
        int fact = 1 ;
        for (int i = n; i > 1 ; i--) {
            fact *= i;
        }
        return fact ; 
    }

    public static int gridway_Modified(int n , int m ){
        int result = 0 ;
        result = factorial(n + m - 2) / (factorial(n-1) * factorial(m-1));
        return result;
    }
    public static void main(String args[]){
        int n = 3; 
        int m = 3; 
        int ways = gridWays(0, 0, n, m);
        System.out.println("Number of ways for grid n = " +n+" , m = "+m+" is: "+ ways);
        
        //Time complexity - O(n)
        System.out.println(gridway_Modified(n, m));
    }
}
