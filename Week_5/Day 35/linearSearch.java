public class linearSearch {


        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Return the index if the target is found
                }
            }
            return -1; // Return -1 if the target is not found in the array
        }
    
        public static void main(String[] args) {
            int[] numbers = {10, 25, 30, 42, 55, 63, 70};
            int target = 42;
    
            int result = linearSearch(numbers, target);
    
            if (result != -1) {
                System.out.println("Element " + target + " found at index " + result);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }
    }
    

