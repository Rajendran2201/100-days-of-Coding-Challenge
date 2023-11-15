public class timeComplexity_02 {

    public static void main(String[] args) {
        int ans = func(5);
    System.out.println(ans);
    }

    private static int func(int n) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            for(int j=n;j>i;j--){
                a = a+i+j;
            }
            
        }
        return a;
    }
    
    
}

/*
 * 
 * 
 * In this  code, the `func` method still contains two nested loops:

1. Outer loop: `for (int i = 0; i < n; i++)`
2. Inner loop: `for (int j = n; j > i; j--)`

Let's analyze the time complexity:

- The outer loop runs `n` times.
- The inner loop starts at `n` and decrements until it reaches `i`. So, for each iteration of the outer loop:
  - The inner loop runs `n - i` times in the first iteration.
  - In the second iteration, it runs `n - (i + 1)` times.
  - This pattern continues until the last iteration of the outer loop, where the inner loop runs `n - (n - 1) = 1` time.

To find the total number of iterations:

1st iteration: `n`
2nd iteration: `n - 1`
3rd iteration: `n - 2`
...
nth iteration: `1`

For example , if n - 5 then the first iteration has 5 operations followed by 4,3,2,1 at the last iteration 
And for calculating its sum we have a formula (5*(5+1))/2 => 30/2 => 15

Similarly, 
The total number of iterations is the sum of the first `n` positive integers, which is `(n * (n + 1)) / 2`.

Therefore, similar to the previous code, the time complexity of the `func` method in this case is also **O(n^2)** 
because the total number of iterations is proportional to `n * (n + 1) / 2`, which simplifies to `O(n^2)` in Big O notation.
 * 
 */