/*
logical operator 
    they are used to join two statement 
    &&  (Logical AND)  
    ||  (Logical OR)
    !   (Logical NOT )

 */
public class _22_logical {
    public static void main(String args[]){

        System.out.println( "The && AND operator : "+ (( 5 > 0 ) && ( 2 > 1 ))) ;
        System.out.println( "The || OR operator : "+ (( 0 > 5 ) || ( 2 < 1 ))) ;
        System.out.println( "The ! NOT operator : "+ (!( 5 > 0 ))) ;
    }
}
