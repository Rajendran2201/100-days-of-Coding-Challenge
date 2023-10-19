import java.util.Scanner;

public class MultilevelInheritance {
    public static void main(String[] args) {
        int rollno = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Roll No :");
        rollno = sc.nextInt();

        FetchMark f = new FetchMark();
        f.printName(rollno);
        f.printAge(rollno);
        f.printMark(rollno);
    }
}
