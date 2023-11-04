import java.util.ArrayList;

public class TwoSum {
   static int[] findPairs(int[] arr,int sum){
    int[] res = {-1,-1};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==sum){
                res[0] = arr[i];
                res[1] = arr[j];
            }
        }
    }
    return res;
   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int sum = 18;
        int[] res = findPairs(arr,sum);
        
        for(int i=0;i<res.length;i++){
            
            System.out.println("pair "+(i+1)+" is "+res[i]);
        }
    }
}

/*
    overall time complexity is O(n * (n-1)) which is equal to n*n - n
 the most dominant term of the expression is n*n
The time complexity of this program is O(n*n)
where n is the size of the input array

*/