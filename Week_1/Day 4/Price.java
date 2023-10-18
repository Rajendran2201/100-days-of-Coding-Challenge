// the Class Price is the subclass / Derived class that has been extended from the base class "AddData"
// This class can access the data from the base class a it is extended from it.

// code of DERIVED CLASS 

public class Price extends AddData{
    
    Price(String item) {
        super(item);                //Super() has to be used mandatorily inside the constructor 
    }

    int price = 1000;

}
