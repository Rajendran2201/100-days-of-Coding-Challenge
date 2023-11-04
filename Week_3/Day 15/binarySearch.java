public class binarySearch {

    private static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                end = mid-1;
            }else if (arr[mid]>target){
                start = mid+1;
            }else {
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 14;
        int ans = find(arr,target);
        System.out.println("The index of the target element in the array is "+ans);
    }
}

// the Time complexity of the program is O(log n)