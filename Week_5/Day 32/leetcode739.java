import java.util.Stack;

public class leetcode739 {
    public static void main(String[] args) {
        leetcode739 solution = new leetcode739();
        
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty() || temperatures[stack.peek()] >= temperatures[i]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int last = stack.pop();
                    ans[last] = i - last;
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
