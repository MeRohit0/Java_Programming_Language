/*
    Abstraction has implemented using 2 ways 
    1. Abstract Class
    2. Interfaces 

    2. Interfaces 
            Interface is the blueprint of a class 
                we have to use the interface keywords
                and to implement we have to use the implements
            
            they are used for 
                - Multiple Inheritance 
                - Total Abstraction unlike abstact class they have abstract and non - abstract function
            
            - All methods are public , abstract and without implementation
            - used to achieve total abstraction
            - Variable in the interface are final and static 

 */
public class _157_Interface {
    public static void main(String[] args) {
        
        Queens q = new Queens();
        Rook r = new Rook();
        King k = new King();
        q.moves();
        r.moves();
        k.moves();

        Bear b = new Bear();
        b.eats();
        
    }
}

interface ChessPlayer{
    void moves();
}

class Queens implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal( in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up ,down, left, right ");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,left,right , diagonal ( by 1 step )");
    }
}

//multiple inhertance 

interface herbivore {
    int num = 5 ;       //properties are final and static 
    void eats();        // behaviour are the public 
}

interface carnivore{
    void eats();
}

class Bear implements herbivore , carnivore {
    public void run(){
        System.out.println("hello");
    }
    public void eats(){
        System.out.println("eats veg and non-veg");
    }
}
