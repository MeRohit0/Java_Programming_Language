/*
    Polymorphism 
    It poly means many and morph means form 
    It is defined as ability to do same task in different way 


    types of polymorphism 

    1. Compile time polymorphism (static polymorphism)
        - Method overloading - multiple functions with same name but different parameters
                                it is
    2. Run time polymorphism  (dynamic polymorphism)
        - Method overriding  -  Parent and child class both contains the same function 
                                    with a different definition

    

 */
public class _154_polymorphism {
    public static void main (String args[]){
        Calculator cal = new Calculator();

        //compile time polymorphism 
        System.out.println(cal.sum(5,9));
        System.out.println(cal.sum( (float)32.2, (float)23.2));
        System.out.println(cal.sum(22 , 42 ,41));

        //runtime polymorphism 
        Deer deer = new Deer();
        deer.eats();
    }
}
class Calculator {
    
    //function overloading 
    int sum ( int a , int b ){
        return a + b ;
    }
    int sum (int a , int b , int c ){
        return a + b + c ; 
    }
    float sum (float a , float b ){
        return a + b ;
    }
}

class Animal {
    void eats(){
        System.out.println("eats everything");
    }
}
//runtime polymorphism
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}