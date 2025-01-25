/*
    Question 3 : Write a program to FindTranspose ofa Matrix.


    Matrix
    a11    a12    a13
    a21    a22    a23
    
    Transposed Matrix
    a11    a21
    a12    a22
    a13    a23

*/
public class _130_2d_arrays_question3 {

    public static void printarr( String arr[][] ){
        for (int i = 0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        String matrix[][] = {{"a11","a12","a13"},
                             {"a21","a22","a23"}};

        String transposed[][] = new String[matrix[0].length][matrix.length];

        //for  row
        for( int i = 0 ; i < transposed.length ; i++ ){
            for( int j = 0 ; j < transposed[0].length ; j++){
                transposed[i][j] = matrix[j][i];
            }
        }
        //before transpose
        System.out.println("Before Transpose");
        printarr(matrix);
        // after transpose
        System.out.println("After Transpose");
        printarr(transposed);
        
    }
    
}