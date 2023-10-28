    import java.util.Scanner;
    public class employeeBonus {



    public static int bonus1(int salary, int atd, int ot) {
        int bonus = 1000;
        if (atd >= 25 && ot >= 50) {
            int cs = salary + bonus;
            return cs;
        } else {
            return salary;
        }
    }

    public static String bonus2(int atd, int ot) {
        if (atd >= 25 && ot >= 50) {
            return "You are eligible for bonus";
        } else {
            return "You are not eligible for bonus";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Attendance: ");
        int atd = sc.nextInt();

        System.out.print("Enter OverTime: ");
        int ot = sc.nextInt();

        String res = bonus2(atd, ot);
        System.out.println(res);

        System.out.println("Your previous salary: " + salary);

        int result = bonus1(salary, atd, ot);
        System.out.println("Your current salary: " + result);
    }
}
