/*
    print spiral matrix 

    {
        {1   ,   2   ,   3   ,   4 }
        {5   ,   6   ,   7   ,   8 }
        {9   ,   10  ,   11  ,   12}
        {13  ,   14  ,   15  ,   16}   
    }

    print  top ---> right ---> bottom ---> left 

 */
public class _125_spiralMatrix {
    public static void printSpiral(int matrix[][]){
        //top , right , bottom , left 
        int top = 0;
        int right = matrix[0].length -1 ;
        int bottom = matrix.length -1 ;
        int left  = 0;
        
        //print all values 
        while(bottom >= top && left >= right){
            //print top 
            for(int i = top ; i < right; i++ ){
                System.out.print(matrix[top][i]);
            }
            //print right
            for(int i = right ; i < bottom ; i ++){
                System.out.print(matrix[i][matrix[0].length]);
            }
            //print bottom
            for(int i = bottom ; i < left; i-- ){
                System.out.print(matrix[bottom][i]);
            }
            //print left 
            for(int i = left ; i < top; i-- ){
                System.out.print(matrix[left][i]);
            }
            top++ ; 
            right++ ;
            bottom-- ; 
            left--;
        }


    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }

}
