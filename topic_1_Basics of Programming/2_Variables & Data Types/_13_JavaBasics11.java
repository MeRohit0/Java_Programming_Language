/* type promotion in expression 
1.  Java convert byte , char, short to int when evaluating in expression.
2.  if one operand is float , long and double the whole expression is
     promoted to long ,float and double respectively.
*/
public class _13_JavaBasics11 {
    public static void main(String args[]){
        //imp : byte*2 is an expression so it will convert --> int datatype  

        byte b = 5;
        b = (byte)(b * 2);
        System.out.println("Value of byte is :"+ b);

        //point 1 ;
        char ch = 'a';
        char ch2 = 'b';
        short sh = 432;
        byte bt = (byte)(ch-ch2-sh);
        int num = ch-ch2-sh;
        System.out.println(bt);    
        System.out.println(num); 
        
        //point 2 

        float flp = 53;
        long lng = 34;
        double dob = 23.42;
        double sum1 = lng + dob ;
        float sum2 = lng + flp;
        System.out.println("Sum of Long + double is : " + sum1);
        System.out.println("Sum of Long + float is : " + sum2);
        
    } 
}
