public class recurPractice02 {
    // Program to print all the elements of an array using recursion 

    public static void main(String[] args) {

        int[] arr = {9,5,6,4,1,2,3,4,5,6,7};
        int len = arr.length;
        printArray(arr,0,len);
    }

    private static void printArray(int[] arr, int i, int len) {
        if(i>=len){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i+1, len);
    }

   
}
