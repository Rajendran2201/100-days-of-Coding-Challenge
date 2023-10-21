import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value to be searched: ");
        int target = sc.nextInt();
        int index = search(arr,target);
        System.out.println("The index position of "+target+" in the array is "+index);
    }

    public static int search(int[] arr, int target) {
        int index = -1;
        int mid;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
             mid = start + (end-start)/2;
             if(arr[mid]>target){
                end = mid-1;
             }else if(arr[mid]<target){
                start = mid+1;
             }else{
                index = mid;
                break;
             }     
        }
        return index;
    }
}
