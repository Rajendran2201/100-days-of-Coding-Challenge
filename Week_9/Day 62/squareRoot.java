public class squareRoot {

    private static double sqrt(int n,int p) {
        if (n == 0 || n == 1) {
            return n;
        }
        int s = 1;
        int e = n;
        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }
            if (m * m < n) {
                s = m + 1;
                root = m; 
            } else {
                e = m - 1;
            }
            double incr = 0.1;
            for(int i = 0; i<=p;i++){
              while(root*root <= n){
                root+=incr;
              }
              root -= incr;
              incr/=10;
            }
        }
        return root; 
    }

    public static void main(String[] args) {
        int number = 40;
        int p = 3;
        // here p refers to the nth root 
        double ans = sqrt(number,p);
        System.out.println("The Square root of " + number + " is " + ans);
    }
}
