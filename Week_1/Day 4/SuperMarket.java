public class SuperMarket {

    /*Inheritance Concept is used inorder to access the data from multiple classes
    here , an object for the class Price is created whereas price is the subclass that has been derived from the sub class AddData 
    the variables item and quantity are declared in the class "AddData" and the variable price is declared in the class "Price" 
    yet, the Subclass/Derived class Price can acces all the three variables. This is the power of Inheritance. 
    Such that the significant property of Inheritance is code reusability 

*/
    public static void main(String[] args) {
        Price a = new Price("Pencil");
        System.out.println("The item bought is "+a.item);
        System.out.println( "The bill is "+a.quantity*a.price);

    }

    /*
     * OUTPUT:
     * 
     * The item bought is Pencil
        The bill is 4000
     */
}
