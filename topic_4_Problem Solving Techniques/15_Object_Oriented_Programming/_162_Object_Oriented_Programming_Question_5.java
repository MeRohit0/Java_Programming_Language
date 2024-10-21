/*
    Question 2 - 4 see assignment 
    Question 5 : Read up about basics of exception handling from here 

    Try- catch method 
 */
public class _162_Object_Oriented_Programming_Question_5 {
    public static void main (String args[]){
    try {
              
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
        
    }catch (Exception e) {
        System.out.println("Something went wrong.");
    }
            
    finally{
        System.out.println("This will always work inrespective of error ");
    }
          
    }
}