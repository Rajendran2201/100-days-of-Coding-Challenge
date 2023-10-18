/*
    This is the base class that has been used by the sub class / derived class . 
    TO acces the data from this class (AddData) , we can just extend it in the new class (Price)
    Such the variables declared within the scope of AddData class can be used in the sub-class as  well


            Point to be noted : The base class is not used inside the main function . 
            We use the derived class inside the main function as it can acces the data of the base class

        
    CODE FOR BASE CLASS 
*/

public class AddData {

    String item;
     int quantity = 4;
    AddData(String item){
        super();
        this.item = item;
       
    }
}
