import java.util.Scanner;
public class linearSearch{
    static int search(int[] arr, int target){
        int index = -1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value to be searched: ");
        int target = sc.nextInt();
        int index = search(arr,target);
        System.out.println("The index position of "+target+" is "+index);
    }
}