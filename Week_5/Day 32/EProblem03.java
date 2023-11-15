import java.util.ArrayList;
public class EProblem03{
    public static void main(String[] args) {
        /*
         * The prime factors of 13195 are 5, 7, 13 and 29.

       largestPrimeFactor(13195) should return 29.
         * 
         */
        largestPrimeFactor(13195);
    }
    
    
    private static boolean isprime(int n){
        for(int i = 2; i*i <=n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static void largestPrimeFactor(int n) {

        ArrayList<Integer> list = new ArrayList();
        int max=Integer.MIN_VALUE;
        boolean ans;
        

        for(int i=1;i<=n;i++){
            if(n%i==0){
            ans = isprime(i);
            if(ans==true){
                list.add(i);
            } }
        }
        for (int i : list) {
            if(i>max){
                max = i;
            }
            
        }
        if (list.isEmpty()) {
             max = n; 
        }

        System.out.println(max);

    }
    
}