/*
    Program for the Creation for 2d arrays 
    Note :  In java arrays are store in contiguous fashion, 
            but 2-D arrays ( matrix ) is not compulsory to store data in contiguous fashion.
 */
import java.util.Scanner;
public class _124_matrics {

    public static void largest_and_smallest_number(int matrix [][] ){
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;
        for (int i = 0 ; i < matrix.length ; i ++){
            for(int j = 0; j < matrix[0].length ; j ++){
                if(matrix[i][j] > max ){
                    max = matrix[i][j];
                }
                if ( min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Largest No is : " + max );
        System.out.println("Smallest No is : " + min );
    }

    public static boolean search (int matrix[][] , int target ){
        for(int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[0].length ; j++){
                if( target == matrix[i][j] ){
                    System.out.println("Element 5 found  at index : [" + i + " , " + j +"] "  );
                    return true ;
                }
            }
        }
        System.out.println("Error 404 element 5 is not found " );

        return false ;
    }
    
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length ; 

        //input values 
        System.out.print("Enter 9 inputs : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix , 5);
        largest_and_smallest_number(matrix);
        sc.close();
    }
}
