/*
    Static keyword 

    static keyword in java is used share the variable or method of a given class 

    - Properties    --> static data members are common between the object of class 
    - Functions     --> static function is called without the object initialization 
    - Block         --> static block is run only once during first object instantiation
    - Nested Class  --> static is used to access the nested class

    NOTE : during execution static has the highest priority --> then block statement 
            apart from constructor  --> then constructor  that's how control flow happen 
    
*/

public class _158_static {
    @SuppressWarnings({ "static-access", "unused" })
    public static void main (String args[]){

        //static properties example 
        Student s1 = new Student();
        s1.schoolName = "RIS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        System.out.println(Student.schoolName);


    }    
}

class Student {
    
    String name ;
    int rollNum ;

    //static properties 
    static String schoolName ;

    //static function
    static int result (int math , int phy , int chem ){
        return (math + phy + chem ) / 3 ;
    }

    //static block
    static {
        System.out.println("Student Block has instantiated");
    }

    //static nested class 
    static class NestedClass{
        public void run() {
            System.out.println("The value of String is : " + schoolName);
        }
    }

    void setName(String name ){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}