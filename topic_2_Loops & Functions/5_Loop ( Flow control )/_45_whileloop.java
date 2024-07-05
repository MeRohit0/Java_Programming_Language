/*
while loop has initialization condition and updation in different line 
 */
public class _45_whileloop {
public static void main(String args[]){
    //initialization statement 
    int counter = 0 ;
    while ( counter < 100 ){
        //condition statement 
        System.out.println("Hello World");
        //updation statement 
        counter++;

    }
    System.out.println("Printed hello world : " + counter + "  times" );

}    
}
