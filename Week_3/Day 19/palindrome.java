public class palindrome {
    public static void main(String[] args) {
        int num = 98789;
        String word = "malayalam";
        boolean ans = isPalindrome(num);
        System.out.println(ans);
         boolean res = isPalindrome(word);
        System.out.println(res);
    }


    private static boolean isPalindrome(int num) {
        int dup = num;
        int rev=0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        if(dup == rev){
            return true;
        }
        return false;
    }
    private static boolean isPalindrome(String word){
      int start = 0;
      int end = word.length()-1;

      while(start<end){
        if(word.charAt(start)!=word.charAt(end)){
            return false;
        }
        start++;
        end--;
      }
      return true;
    }
}