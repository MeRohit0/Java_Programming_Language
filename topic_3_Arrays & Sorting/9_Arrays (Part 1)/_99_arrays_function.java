/*
    arrays as passing in function as arguments
    NOTE : array are pass by call by reference  
 */
public class _99_arrays_function {
    public static void update(int marks[]){
        for(int i = 0 ; i < marks.length ; i ++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = { 95 ,84, 34};

        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        
    }
}
