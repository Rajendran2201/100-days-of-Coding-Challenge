public class FetchMark extends FetchAge{
    void printMark (int rollno){
        switch(rollno){
            case 1:
                System.out.println("Your mark is 98");
                break;
            case 2:
                System.out.println("Your mark is 87");
                break;
            default:
                System.out.println("Your mark is 76");
        }
    }
}
