import java.awt.Dimension;

public class PassByValue {
    private int foo = -1;  //used in one of the mutator functions below

    public static void main(String[] args) {
        int a = 3;                      // a primitive variable
        Dimension b = new Dimension();  // a reference variable
        
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
        
        mutate(a);
        mutate(b);
        
        System.out.println("a is :"+ a);
        System.out.println("b is :" + b);
    }

    public static void mutate(int z) {  //does it matter that I called my input data "z" here?
        z = -1000;  // if z is only a copy, this won't affect the variable a's value in main
        
        //this.foo = -1000;
        // why does the line above cause compiler errors?
    }
    
    public static void mutate(Dimension c) {  
        c.height = -1000;
        c.width = -1000;
        //if I didn't hand this function a copy of b from main, but rather a reference to the object that is known in main as b, what happens here?
        //if I make a change to c, are my changes reflected back in the code that called this function?  In other words, did this change b of main?
    }
    
}