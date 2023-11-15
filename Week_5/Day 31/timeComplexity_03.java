public class timeComplexity_03 {
    public static void main(String[] args) {
        func(16);
    }

    private static void func(int n) {
        int i=1,s=1;
        while(s<=n){
            i++;
            s=s+i;
            System.out.println("Hello,Students");
        }
    }
}

/*
 * 
 * In the given code, the `func` method uses a while loop that increments `i` until the value of `s` exceeds `n`. Inside the loop, there's a constant operation of printing "Hello, Students".

Let's break down the time complexity:

The while loop increments `i` and updates `s` until `s` exceeds `n`. The value of `s` is updated as `s = s + i`, where `i` starts from 2.

The loop will run until `s` becomes greater than `n`. The value of `s` at each step is the cumulative sum of integers starting from 1 (i.e., `1 + 2 + 3 + ... + i`).

The sum of the first `k` integers is `(k * (k + 1)) / 2`.

The loop runs until `s` exceeds `n`. Let's find the value of `i` when `s` becomes greater than `n`:

- For `i = 1`, `s = 1 + 2 = 3`
- For `i = 2`, `s = 1 + 2 + 3 = 6`
- For `i = 3`, `s = 1 + 2 + 3 + 4 = 10`
- For `i = 4`, `s = 1 + 2 + 3 + 4 + 5 = 15`
- For `i = 5`, `s = 1 + 2 + 3 + 4 + 5 + 6 = 21`

The loop stops when `i = 5` because `s = 21`, which exceeds `n = 16`.

Therefore, the time complexity of this code is **O(sqrt(n))** because the loop runs until the sum `s` exceeds `n`, and the value of `i` at that point is the square root of `n`. The loop stops when the sum surpasses `n`, which happens when `i` reaches approximately the square root of `n`.
 * 
 */