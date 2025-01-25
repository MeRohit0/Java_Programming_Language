/*
    Introduction to Constructor

    Constructor is a special function which is invocked automatically at the time of object creation 

    - Constructor have the same name as class or struct 
    - Constructor don't have any return type. (Not even void)
    - Constructor are only called once , at object creation
    - Memory allocation happens when constuctor is called.

    NOTE :  if no constructor is present in class then default constructor is called by compiler 

-----   ------      -------     -------     --------      -------     ---------       --------

    Types of Constructor 
    
    1. Non - Parameterized 
    2. Parameterized
    3. Copy Constructor 

    Non - parameterized and parameterized constructor is used to initaiblize the object 

    Copy constructor is used for copy the entire properties object1 to object2 
        in java we have to do ourself 
    
    ** Warning becareful for the copy constructor as String and arrays will share reference only **

    Shallow and Deep copy 
    shallow copy      - we pass only references so changes in another object also reflect in this object.
    deep copy         - In this we create a new array and copy the contents
    lazy copy         - in this we use the counter variable to know how many variable 
                            have the same variable 

-----   ------      -------     -------     --------      -------     ---------       --------

    Destructors

    It is a special function in which is invoked to delete the object from memory if it's not in use 
    this process is done automatically via the java garbage collector 


 */

public class _152_Constructors {
@SuppressWarnings("unused")
public static void main(String args[]){

    //Non - Parameterized constructor
    Student s1 = new Student();


    //Parameterized constructor
    Student s2 = new Student("rohit");
    System.out.println(s2.name);
    Student s3 = new Student(1234);
    

    //copy constructor
    Student s4 = new Student(2352);
    s4.marks[0] = 100 ;
    s4.marks[1] = 90 ;
    s4.marks[2] = 80 ;

    Student s5 = new Student(s4);
    System.out.println(s4.roll_no);
    System.out.println(s4.name);

    for(int i = 0 ; i < s5.marks.length ; i++){
        System.out.print(s4.marks[i] + " ");
    }
    System.out.println();

    s4.marks[2] = 49 ;


    for(int i = 0 ; i < s5.marks.length ; i++){
        System.out.print(s4.marks[i] + " ");
    }
    System.out.println();

}
}
class Student {
    String name ;
    int roll_no ;
    //this will give unexpected results incase of shallow copy 
    int marks[] = new int[3];

    //Non - parameterized constructor
    Student(){  
        System.out.println("constructor is called...");
    }

    //Parameterized constructor
    Student(String name){ 
        this.name = name ;
    }
    Student(int roll_no){
        this.roll_no = roll_no;
    }

    //copy constructor

    //shallow copy      - we pass only references so changes in another object also reflect in this 

    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll_no = s1.roll_no;
    //     this.marks = s1.marks ;
    // }

    // deep copy        - in this we create a new array and copy the contents 
    Student(Student s1){
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}