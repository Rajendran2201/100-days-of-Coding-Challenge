//PARENT CLASS  derived from FetchName class

public class FetchAge extends FetchName{
    void printAge (int rollno){
        switch(rollno){
            case 1:
                System.out.println("Your age is 17");
                break;
            case 2:
                System.out.println("Your age is 18");
                break;
            default:
                System.out.println("Your age is 19");
        }
    }
}
