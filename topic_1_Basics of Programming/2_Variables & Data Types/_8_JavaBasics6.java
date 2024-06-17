/*Program for taking user input using Scanner Class 
and perform function 

next();  
nextLine();    
nextInt();
nextByte();      
nextFloat();    
nextdouble();
nextBoolean();      
nextshort();
nextLong();

*/
import java.util.*;
public class _8_JavaBasics6 {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

//using the next();    
        System.out.println("Enter a Word");
        String name1 = sc.next();
        System.out.println(name1);
        
        /*in next() if we gave more then on word then it will 
        ignore the space and give this to next scanner object see below
         */

//using the nextLine();
        System.out.println("Enter a string value : ");
        sc.nextLine();   //this is to ignore the previous input from next()
        String name2 = sc.nextLine();
        System.out.println(name2);

// using the nextInt();
        System.out.println("Enter a integer value ");
        int num = sc.nextInt();
        System.out.println("The Number is :" + num);

// using nextByte();
        System.out.println("Enter a byte value ");
        byte byt = sc.nextByte();
        System.out.println("The Byte number is :" + byt);

//Using nextFloat();
        System.out.println("Enter a float value ");
        float flo = sc.nextFloat();
        System.out.println("The float number is : " + flo);

//Using nextDouble();
        System.out.println("Enter a double value ");
        double doub = sc.nextDouble();
        System.out.println("The double number is : " + doub);

//using nextBoolean();
        System.out.println("Enter a boolean value ");
        boolean bool = sc.nextBoolean();
        System.out.println("The boolean number is : " + bool);

//using nextShort();        
        System.out.println("Enter a short value ");
        short shrt = sc.nextShort();
        System.out.println("The short number is : " + shrt);

//using nextLong();
        System.out.println("Enter a long value ");
        long lng = sc.nextLong();
        System.out.println("The long number is : " + lng);
        

// here we have close the system.in resource
        sc.close();
    }
}
