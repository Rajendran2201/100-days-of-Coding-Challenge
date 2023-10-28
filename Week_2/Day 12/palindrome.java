public class palindrome {
    public boolean isPalindrome(int num) {
        if (num < 0 || (num != 0 && num % 10 == 0)) {
            return false;
        }
        int ans = 0;
        while (num > ans) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        return (num == ans || num == ans / 10);
    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        boolean isPalindrome1 = p.isPalindrome(num1);
        boolean isPalindrome2 = p.isPalindrome(num2);
        boolean isPalindrome3 = p.isPalindrome(num3);

        System.out.println(num1 + " is a palindrome: " + isPalindrome1);
        System.out.println(num2 + " is a palindrome: " + isPalindrome2);
        System.out.println(num3 + " is a palindrome: " + isPalindrome3);
    }
}
