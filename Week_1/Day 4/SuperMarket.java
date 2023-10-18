public class SuperMarket {

    //Inheritance Concept is used here 
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
