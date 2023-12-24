public class linear_search{
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    int target = 8;
    int found_index = 0;
    for(int i = 0 ;i < arr.length; i++){
        if(arr[i]==target){
          found_index = i;
        }
    }

    System.out.println("The target is in the index : "+found_index);
  }
}



/*
 * 
 * Advantages of Linear Search:
 * 
Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
Does not require any additional memory.
It is a well-suited algorithm for small datasets.



Drawbacks of Linear Search:

Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
Not suitable for large arrays.



When to use Linear Search?

When we are dealing with a small dataset.
When you are searching for a dataset stored in contiguous memory.
 * 
 */