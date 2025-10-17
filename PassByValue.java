/* 


1. What is the primary difference between passing a primitive to a method versus passing an object?

When a primitive is passed to a method, Java makes a copy of the value.
When an object is passed to a method, Java passes a copy of the reference (address) that points to the object in memory.


2. When a primitive is passed to a method, dzoes the scope of that primitive change?

No.
The primitive’s scope stays local to where it was declared. The method only receives a copy so changes inside the method do not affect the original variable.


3. What about when an object is passed to a method?

When an object is passed, the reference* to that object is copied and sent to the method.
Both the original and the parameter point to the same memory location so any changes to the object’s internal state will be visible outside the method.


4. How would you describe the scope of an object that has been passed to a method?

The object itself has global visibility as long as a reference to it exists.
However, the reference variable’s name inside the method (like `c`) is local — it’s just another pointer to the same object.

*/

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