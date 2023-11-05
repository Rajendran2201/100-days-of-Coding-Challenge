public class nonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 2, 1};
        int nonDup = findNonDuplicate(arr);
        System.out.println(nonDup);
    }

    private static int findNonDuplicate(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        return ans;
    }
}
