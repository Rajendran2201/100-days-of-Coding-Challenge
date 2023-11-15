public class timeComplexity_01 {
    public static void main(String[] args) {
        int n= 9;
        for(int i=1;i<n;i=i*2){
            System.out.println("Hello");
        }
    }
}


// The time complexity of the above code snippet is log(n) 

// This is because the incremential value of i is i*2 such that the value increases by 2^n-1 
// on taking log base 2 on both sides we get the time complexity of the code as log(n)
