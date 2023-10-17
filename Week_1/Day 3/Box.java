/*
        Implementation of Box Class 

        the class conatins of three data namely height , width and breath. the data is manipulated to find the area and volume of the shapes.
        Here, I have used a constructor for initialising the values provided in the main function to the variables in the Class.
        So that, the user doesn't have to provide the values to every single functions such as areaOf and volumeOf 
        As the variables are declared in the global scope, we can access them inside the functions as well.

        Point to be noted : a super() is mandatory to be used inside the constructor 
        Why? if you don’t type in the call to super in your constructor 
        then the compiler will provide you with a non-argument call to super at the first line of your code

*/

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


