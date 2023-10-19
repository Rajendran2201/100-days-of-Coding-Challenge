/**

This is an example of Heirarchial Inheritance 
MultiplyData is the base class whereas AddData and SubtractData are the sub class derived from the parent class
Thus the constructor of the parent class is called when the object is created for the sub classes


*/

public class HierarchialInheritance{
public static void main(String[] args) {
    AddData a = new AddData(2,3,4);                     // the parent class constructor and the constructor of this class are executed 
    SubtractData s = new SubtractData(19, 2, 4);        // the parent class construtor and the constructor of this class are executed 
}
}

/*
 * 
 * OUTPUT: 
            The product of the values are 24
            The sum of the values are 9
            The product of the values are 152
            The difference of the values are 13
 */
