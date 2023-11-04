public class findElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 4;

        boolean ans = isElementFound(arr,target);
        System.out.println(ans);
        
    }

    private static boolean isElementFound(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}

// The time complexity of the program is O(n)

