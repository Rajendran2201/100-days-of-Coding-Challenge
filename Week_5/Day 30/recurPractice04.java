public class recurPractice04 {

    // programto find the factorial of a number 


    public static void main(String[] args) {

        int n = 5;
        int fact = 1;
        fact = findFact(n,fact);
        System.out.println(fact);
        
    }

    private static int findFact(int n, int fact) {
        if(n<=1){
            return fact;
        }
       fact = fact * n;
        return findFact(n-1, fact);
    }
}
