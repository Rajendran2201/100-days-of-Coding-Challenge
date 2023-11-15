public class timeComplexity_04 {
    public static void main(String[] args) {
        func(3);
    }

    private static void func(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=n; j++) {

                System.out.println("Hello,students");
                break;
                
            }
            
        }
    }
}

// The outer loop runs n times whereas the inner loop runs 1 time 
// thus the time complexity is n+1 which is O(n)