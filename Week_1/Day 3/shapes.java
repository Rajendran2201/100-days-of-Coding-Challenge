/*
    Creating a class box inorder to calculate the area and volume of a shape which has three dimensions (width,height,breadth) 
    The area nd volume can be calculated by using two different methods namely areaOf and volumeOf
    
*/

public class shapes {
    public static void main(String[] args) {
        Box b = new Box(2,3,4);
        int area = b.areaOf();
        int volume = b.volumeOf();
        System.out.println("The Area of the shape is "+area);
        System.out.println("The Volume of the shape is "+volume);


    }
}
