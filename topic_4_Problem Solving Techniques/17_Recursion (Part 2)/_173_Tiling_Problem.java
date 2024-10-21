/*
    Program to Tiling problem we have the a board 2 * n and we hava tile of size 2 * 1 , 
        count the number of ways tiles can arrange , we can either vertical and horizontally 

    f(n) = f(n-1) + f(n-2)
 */

public class _173_Tiling_Problem {

    public static int tilingProblem(int n){
        //base case
        if(n == 1 || n == 0 ){
            return 1 ;
        }
        return tilingProblem(n-1) + tilingProblem(n-2);
        //working 
        //vertical choice 
        // int fnm1 = tilingProblem(n-1);

        // //horizontal problem 
        // int fnm2 = tilingProblem(n-2);

        // int totalways = fnm1 + fnm2;

        // return totalways;
        


    }
    public static void main(String args[]){
        
        System.out.println(tilingProblem(4));

    }   
}