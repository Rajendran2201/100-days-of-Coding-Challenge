/*
It is sub class which has been derived from the base class "CheckOddEven"
It evaluates whether the given number is POsitive or negative upon the creation of the object. 
This is because the code is written inside the constructor.

Since CheckPositiveNegative is the derived class, It can access the method "OddOrEven" of the parent class which evaluates whether the given number is Odd or Even 

*/


public class CheckPositiveNegative extends CheckOddEven {        // Derived_class extends Base_class
    boolean oddEven;

    CheckPositiveNegative(int value){
        super();                                                  //super() must be the first statement in a constructor 
        oddEven = OddOrEven(value);                               //This method is declared in the parent class
        if(value < 0){
            if(oddEven){
                System.out.println("It is a Negative Even NUmber");
            }else{
                System.out.println("It is a Negative Odd Number");
            }
        }else{
            if(oddEven){
                System.out.println("It is a Positive Even NUmber");
            }else{
                System.out.println("It is a Positive Odd Number");
            }
        }
    }


}
