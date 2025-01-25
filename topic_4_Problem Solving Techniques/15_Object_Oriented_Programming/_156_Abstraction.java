/*
    Abstraction 
       Hiding all the unnecessary details and showing only the important parts to the user.

    
    Abstract means idea so it mainly deal with design not actual implementation 

    Abstraction has implemented using 2 ways 
    1. Abstract Class
    2. Interfaces 

    1. Abstract Class
         we have to use the abstract keyword.

            - Cannot create an instance of the abstract class
            - Can have abstract / non - abstract methods
            - Can have constructor

            we have to implement the abstract function in sub-class 

    2. Interfaces 
            Interface is the blueprint of a class 
                we have to use the interface keywords
                and to implement we have to use the implements
            
            they are used for 
                - Multiple Inheritance 
                - Total Abstraction unlike abstact class they have abstract and non - abstract function
            
            - All methods are public , abstract and without implementation
            - used to achieve total abstraction
            - Variable in the interface are final , public and static 



 */
public class _156_Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walk();

        Chicken c = new Chicken();
        c.eats();
        c.walk();

        System.out.println("\nMustang object is created\n");
        // Animal -> Horse -> Mustang
        @SuppressWarnings("unused")
        Mustang m = new Mustang();

    }
    
}

abstract class Animal {
    String color ;
    Animal() {
        color = "brown";
        System.out.println("Animal Constructor is called");
    }
    void eats(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
