/*
    Constructor chaining 
    
    it is the process of calling from one constructor to another constructor

    1. within class
    2. to other class 

    1. within class 

        - we are going to use the this() keyword 

        this keyword can also be used as super keyword for within the class to call the 
            constructor of different parameter (function overloading ) 
            see topic constructor chaining on gfg 

        1. this() expression should always be first in line of the constructor 
        2. there should be at least one constructor without the this() keyword 
        3. construction chaining can be achieved in any order 

    2. to other class 

        - super keyword is used refer the immediate parent class and 
            call the constructor of different parameter

        - super() expression should always be first in line of the constructor

    3. init block 

        - it is used to run in respective of within or other class constructor called 
        
        - Init block is always executed before any constructor, whenever a constructor
             is used for creating a new object.

 */
public class _160_Constuctor_Chaining {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        //Constructor Chaining 
        //within class from bottom to up  
        new Temp();
        
        //From top to bottom 
        System.out.println("\nSecond from base class ");
        new Temp2(5,2);
        
        //to other class 
        System.out.println();
        Drived d = new Drived(65);

        //Init block has the highest priority then constructor
        Car c = new Car();
    }
}

class Temp {

    int number ;
    Temp(){
        this(5);
        System.out.println("The Default Constructor");
    }
    Temp(int n){
        this(5,10);
        System.out.println("The Second Constructor");
    }
    Temp(int n , int m ){
        System.out.println("The Third Constructor");
    }
}

class Temp2 {
    int number ;
    Temp2(){
        System.out.println("The Default Constructor");
    }
    Temp2(int n ){
        this();
        this.number = n ;
        System.out.println("The Second Constructor");
    }
    Temp2(int n , int m){
        this(5);
        System.out.println("The Third Constructor");
        
    }
}

//other class constructor is called 

class Base {

    int name ; 

    Base(){
        System.out.println("no argument constructor of base class");
    }
    Base(int n ){
        this.name =  n; 
        System.out.println("with Argument constructor of base class");
    }
}

class Drived extends Base{
    Drived(){
        System.out.println("no argument constructor of Drived class");
    }
    Drived(int n ){
        super(n);
        System.out.println("with Argument constructor of Drived class");
    }
}

// Java Program to Illustrate Initializer Block 


class Car { 

	// Class member variable 
	int speed; 

    // Block 
    {
        System.out.println("This block is executed even before the constructor called");
    }
	
	// Constructor 
	Car() 
	{ 

		// Print statement when constructor is called 
		System.out.println("Speed of Car: " + speed); 
	} 
	// Block 
	{ 
		speed = 60; 
	} 

}
