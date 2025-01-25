/*
    Super keyword 

    super keyword is used to refer the immediate parent's class object.

    - to access parent's properties 
    - to access parent's function 
    - to access th parent constrictor 

 */
public class _159_Super {
    public static void main(String args[]){
        Horse h = new Horse();
        BabyHorse b = new BabyHorse();
        System.out.println(h.skin);
        System.out.println(b.skin);

    }
}

class Animal {
    Animal(){
        System.out.println("Animal constructor is called");
    }
    String skin = "Brown";
}

class Horse extends Animal {
    Horse(){
        super.skin = "dark brown";
        System.out.println("Horse constructor is called");
    }
}

class BabyHorse extends Horse{
    BabyHorse(){
        super.skin = "pink";
        System.out.println("BabyHorse constructor is called");
    }
}
