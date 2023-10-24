public class polymorphism{
    public static void main(String[] args) {
        methodClass m = new methodClass();

        int ans1 = m.add(1,2);
        int ans2 = m.add(1,2,3);
       double ans3 =  m.add(1.1,2.2,3.3);
       System.out.println("Solution :"+ans1+","+ans2+","+ans3);
    }
}