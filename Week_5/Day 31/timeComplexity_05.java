public class timeComplexity_05 {
    public static void main(String[] args) {
        func(6);
    }

    private static void func(int n) {

        for( int i = n/2; i<n;i++){
            for(int j=0; j+n/2<n; j++){
                for(int k=1;k<n;k=k*2){
                    System.out.println("Hello Students");
                }

            }
        }
    }
}


/*
 * 
 * 
 * Let's break down the time complexity of the given code:

The code contains three nested loops:

1. Outer loop: `for( int i = n/2; i<n;i++)`
2. Middle loop: `for(int j=0; j+n/2<n; j++)`
3. Inner loop: `for(int k=1;k<n;k=k*2)`

Let's analyze each loop:

1. **Outer loop**:
   - It runs `n - n/2 = n/2` times. In terms of big O, it's O(n).

2. **Middle loop**:
   - It runs as long as `j + n/2 < n`, which is equivalent to `j < n/2`.
   - Therefore, this loop runs `n/2` times. It doesn't depend on the value of `n` itself, so it's constant relative to `n`. Thus, it's O(1).

3. **Inner loop**:
   - It runs until `k` reaches `n`, doubling `k` in each iteration (`k=k*2`).
   - The number of iterations for `k` doubling is logarithmic with base 2. The loop runs until `k` becomes equal to `n`.
   - The number of iterations here is determined by `log₂(n)`.

Now, let's combine the complexities:

The overall time complexity is determined by multiplying the complexities of these loops together.

- The outer loop is O(n).
- The middle loop is O(1).
- The inner loop is O(log n).

Therefore, when we combine them, the overall time complexity of the `func` method is **O(n * log n)**, considering the nested nature of the loops and their respective complexities.
 * 
 */