/*
    Strings data type used to store string in memory location
    
    String can include characters , number and special characters also 
        like (a,b,c, asd,$5,533, sdf34@#$@$)
    
📌 NOTE : Strings are IMMUTABLE (its value cannot be changed once assign)

    Input/Output of string is done by Scanner / print function similar to int 

    String lenght() method is used to get length of string 

    concatenation of strings

    charAt() method is used to check character at the index 

    equals() method is used to check the value of String object rather then 
        objects are same unlike in == operator it check if they both are same object or not

📌  NOTE: we should not use == operator to compare on the object reference they are same 
            this refers to same object that's why we should use equals() method for its value

    Explanation :

    It uses interning concept to store the only one instance of each string in intern pool,
    
    in java we have two type of memory stack and heap memory 
    while stack memory use for storing function call and variable and 
    heap memory is used for dynamic memory allocation during runtime of program 

    therefore in string we use the interning concept to store the value of 
    string and return the reference to the string variable to save memory 




 */
import java.util.Scanner;
public class _131_Strings {

    public static void printstring(String str){
        for(int i = 0 ; i < str.length() ; i ++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    @SuppressWarnings({ "unused", "resource" })  // it is used to ignore the error 
    public static void main(String arg[]){      // because not use the strings variable 
        char arr[] = { 'a', 'b','c','d'};

        // string initialization 
        String str = "hello i am string";
        String str2 = new String("hello i am also a string ");

        //input by the user 
        Scanner sc = new Scanner (System.in);
        String name ;
        System.out.println("Please enter tony stark or Enter your name : ");
        name = sc.nextLine();

        //print the output
        System.out.println(name);

        String fullname = "Tony Stark";
        System.out.println("Total length of "+"tony start"+" is : "+fullname.length());

        //concatenation of string 

        String firstname = "Rohit";
        String lastname = "Kumar" ;
        String full_name = firstname + " " + lastname ;
        System.out.println( "Name : "+ full_name  );

        //charAt() method 
        printstring(full_name);

        //equals() method 
        String st = "Tony";
        String st2 = "Tony";
        String st3 = new String("Tony");

        //st and st2 are same object as they point to same string 
        if( st == st2 ){
            System.out.println("They are same ");
        }
        else{
            System.out.println("They are diffent");
        }
        // st and st3 are diffent as st3 is initiated via new keyword therefore new object
        // is in initiated.
        if( st == st3 ){
            System.out.println("They are same ");
        }
        else{
            System.out.println("They are diffent");
        }
        //equals() are used to check the content but objects are same or not unlike == operator
        if(st.equals(st3)) {
            System.out.println("They both are same");
        }

    }
}
