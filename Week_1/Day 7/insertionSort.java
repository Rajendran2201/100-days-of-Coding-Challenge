public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {8,9,7,6,4,5,3,1,2};
        sort(arr);
        System.out.print("The array after sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
       
    }

    private static void sort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
