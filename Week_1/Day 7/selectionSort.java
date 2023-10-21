public class selectionSort {

    static void sort(int[] arr){
       
        for(int i=0;i<arr.length-1;i++){
            int min = i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
       
    }
    public static void main(String[] args) {
    
        int[] arr = {8,9,7,6,4,5,3,1,2};
        sort(arr);
        System.out.print("The array after sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
