/*
    It is the parent class which conatins the method "CheckOddEven" that evaluates whether the given number is odd or even .
    This method is used by the derived class.
    The code written here can be accessed by the class "CheckPositiveNegative" as it has been extended from here.

    PARENT CLASS 
    
*/


public class CheckOddEven{

    int value;
    
    public CheckOddEven() {                                //Constructor with no parameters 
        super();
    }

    CheckOddEven(int value){                                //Constructor with a parameter
        super();
        this.value = value;  
    }

    boolean OddOrEven(int value){                            //Method to evaluate whether the value provided is odd or even 
        if(value % 2==0){
            return true;
        }else{
            return false;
        }
    }

}
