/*
    Working with Constructors 

    Constructors are called when they objected are created ! 
    A constructor should have the same name as the class.
    The constructors are called when objects c1, c2 and c3 are created 

*/

package Constructors;
public class Constructors {
    public static void main(String[] args){
        Construct c1 = new Construct();                     //Construct() is called 
        Construct c2 = new Construct(8);                    // Construct(int val) is called 
        Construct c3 = new Construct("Raj", 18);            // Construct(String name, int age) is called
    }
}

/*
 * OUTPUT: 
 * 
 *      Constructor is called !
        The provided value is 8
        Name :Raj Age: 18
 * 
 */
