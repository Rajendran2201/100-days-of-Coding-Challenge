public class countDigits {
        public int findNumbers(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (evendigits(arr[i])) {
                    count++;
                }
            }
            return count;
        }
    
        static boolean evendigits(int num) {
            int ans = digits(num);
            return ans % 2 == 0;
        }
    
        static int digits(int num) {
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            return count;
        }
    
        public static void main(String[] args) {
            countDigits digits = new countDigits();
            int[] arr = {12, 345, 2, 6, 7896};
    
            int result = digits.findNumbers(arr);
    
            System.out.println("The number of integers with an even number of digits is: " + result);
        }
    }
    
