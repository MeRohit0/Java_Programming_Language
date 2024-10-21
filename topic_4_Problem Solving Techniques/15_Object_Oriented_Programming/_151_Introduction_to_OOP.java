/*

Introduction to OOP 

    Object Oriented Programming has many 4 topic's

    1. Abstraction 
    2. Polymorphism 
    3. Inheritence
    4. Encapsulation

    Abstraction Hiding all the unnecessary details and showing only the important parts to the user

    Polymorphism is poly means many and morph means form 
        It is defined as ability to do same task in different way 

    Inheritance is when properties & method of base class are passed on to a drived class.

    Encapsulation is defined as the wrapping of data & methods under a single unit. 
        It also implements the data hiding.


Class & Objects

    Class : group of these entities
    Objects : entities in the real world

    class has       1. attributes (Properties) e.g. color
                    2. functions (behaviours) e.g. changeColor()


NOTE : Its general advice that the name of class is begins
        with uppercase letters and in function with lowercase letters 


--------      ---------       ---------       ---------       ---------       --------        --------


Access Modifiers or Access Specifiers
    they are use to get the access of the function and variable between the classes and the packages

    --------------------------------------------------------------------------------------------------------------------------
   | Access Modifier |   Within class |   within package |     outside the package by subclass only |     outside package    |
   | ----------------|----------------|------------------|------------------------------------------|------------------------|
   | Private         |       Y        |        N         |                     N                    |            N           |
   | Default         |       Y        |        Y         |                     N                    |            N           |
   | Protected       |       Y        |        Y         |                     Y                    |            N           |    
   | Public          |       Y        |        Y         |                     Y                    |            Y           |
   |                 |                |                  |                                          |                        |
    --------------------------------------------------------------------------------------------------------------------------


--------      ---------       ---------       ---------       ---------       --------        --------      --------      ---------


Getters & Setters 

    they are use to get the value or set the value for private data member
    Get : to return the value 
    Set : to Modify the value 

    NOTE : this keyword is used to refer to the current object 



--------      ---------       ---------       ---------       ---------       --------        --------      --------      ---------

NOTE : 

    - We use dot operator to access the property and funtion of the class 

    - In Java only private and protected class access specifier are not permitted 

    - In Java we can make reference variable of parent class and assign object of child class 
    
            Reference  -> Object 
            (variable)     (obj)

            class Vehicle{}
            class Car extends Vehicle{}
            Vehicle v = new Car();

    


 */

public class _151_Introduction_to_OOP{

    public static void main(String args[]){

        Pen p1 = new Pen();         // creating a pen object called p1
        
        //pen color assign
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        
        //set pen tip
        p1.setTip(5);
        System.out.println(p1.getTip());

        //set color and tip directly 
        p1.setColor("black");
        p1.setTip (4);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        //bank username access and password set 
        Bank myAccount = new Bank();
        myAccount.username = "MeRohit";
        // myAccount.password = "ABCDEFGH";             This is invalid for private data 
        myAccount.setPassword("abcdefgh");
        System.out.println(myAccount.username);
        

    }
}

class Bank{
    public String username ;
    private String password ;
    void setPassword(String newPassword){
        password = newPassword;
    }
    String getPassword(){
        return this.password;
    }
}

class Pen{

    //pen properties has color and tip size
    private String color ;
    private int tip ;
    
    // getter 
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    // setters 
    void setColor(String newcolor){
        color = newcolor;
    } 
    void setTip(int newtip){
        tip = newtip ; 
    }
}

