/*
    Inheritance is the defined as when properties & method of base class are passed on to a drived class.

    parent class (or base class) drives the properties to child class (or drived class)

NOTE: we use the extends keywords to inherit properties from parent class 

    Types of Inheritance 

    1. Single level Inheritance
    2. Multi-level Inheritance 
    3. Hierarchial Inheritance 
    4. Hybrid Inheritance 
    5. Multiple Inheritance 

     1. Single level Inheritance

        It has one parent class and one derived class 
        Single Base Class      ---->   Derived Class 
    
     2. Multi-level Inheritance 

        It has one parent class and one child class on level base 
        Single base class      ---->    Derived Class   ----> Derived Class

     3. Hierarchial Inheritance

        It has single base class and more than one derived class 
        base class             ---->    Fish  
                               ---->    Bird
                               ---->    Mammal

     4. Hybrid Inheritance 

        It is the mixed of two or more type like multi-level inheritance and hierarchial inheritance 
        base class             ---->    Fish    ----> Tuna , Shark
                               ---->    Bird    ----> Peacock 
                               ---->    Mammal  ----> Dog , Cat , Human

     5. Multiple Inheritance 

        This is not directly present in the java we have to use the interface to implement the multiple 
            inheritance 
            see program @_157_Interface.java




 */
public class _153_Inheritance {
    public static void main(String[] args) {
        //Single level Inheritance 
        Fish shark = new Fish();
        shark.eat();

        //Multi-level Inheritance
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4 ; 
        System.out.println(doggy.legs);

        //Hierarchial Inheritance 
        Mammal humans = new Mammal();
        Fish shark2 = new Fish();
        Bird pigeon = new Bird();

        humans.eat();
        humans.walks();
        shark2.swim();
        shark2.breathe();
        pigeon.eat();
        pigeon.fly();

        //Hybrid Inheritance 
        Tuna tuna = new Tuna();
        Shark shark3 = new Shark();
        Peacock peacock_bird = new Peacock();
        Dog doggy2 = new Dog();
        Cat cat = new Cat();
        Human person = new Human();

        tuna.size();
        shark3.sharp_teeths();
        peacock_bird.feather();
        doggy2.bark();
        cat.fur();
        person.talk();

        //parent reference variable is assign child object that 
            //why parent don't know about the child methods 
        // Animal f = new Fish ();
        // f.swim();

    }
}

// Baseclass or parent class
class Animal {
    String color ;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//Drived Class or sub-class 
class Fish extends Animal{
    int fins ; 
    void swim(){
        System.out.println("swims in water");
    }
}
class Tuna extends Fish {
    void size(){
        System.out.println("Size is small");
    } 
}
class Shark extends Fish {
    void sharp_teeths(){
        System.out.println("Sharp Teeth");
    }  
}

class Bird extends Animal {
    void fly(){
        System.out.println("fly");
    }
}
class Peacock extends Bird {
    void feather(){
        System.out.println("Beautiful Feather");
    }
}

class Mammal extends Animal {
    int legs ; 
    void walks(){
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    String breed ;
    void bark(){
        System.out.println("bark");
    }
}

class Cat extends Mammal {
    void fur(){
        System.out.println("white fur");
    } ;
}
class Human extends Mammal {
    void talk() {
        System.out.println("Talk");
    }
}

