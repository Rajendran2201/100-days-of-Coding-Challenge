import java.util.ArrayList;

public class Problem01{
    public static void main(String[] args) {
        /*
         * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below the provided parameter value number.

        multiplesOf3and5(10) should return a number.
         multiplesOf3and5(49) should return 543.
         multiplesOf3and5(1000) should return 233168.
        multiplesOf3and5(8456) should return 16687353.
        multiplesOf3and5(19564) should return 89301183.
         * 
         */
        int n=19564;
        multiplesOf3and5(n);
    }

    private static void multiplesOf3and5(int n) {
        int sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if((i%3==0)||(i%5==0)){
                list.add(i);
            }
        }

        for (Integer integer : list) {

            sum+=integer;
            
        }
        System.out.println(sum);
    }
}