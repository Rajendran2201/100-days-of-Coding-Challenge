// We cannot use Grandparent's members in this class. This is because In JAVA, derived classes cannot acces the members of grandparent's class

/*    Sub Class / Derived Class     */

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
