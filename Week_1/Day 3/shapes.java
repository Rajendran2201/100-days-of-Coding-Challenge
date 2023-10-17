public class shapes {
    public static void main(String[] args) {
        Box b = new Box(2,3,4);
        int area = b.areaOf();
        int volume = b.volumeOf();
        System.out.println("The Area of the shape is "+area);
        System.out.println("The Volume of the shape is "+volume);


    }
}
