public class Box {
    
    int width;
    int height;
    int breadth;
    Box(int w,int h, int b){
        super();
        width = w;
        height = h;
        breadth = b;

    }
    int areaOf(){
        return width*breadth;
    }
    int volumeOf(){
        return width*height*breadth;
    }
    
}


