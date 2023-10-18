import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;        //Here We have used HashSet inorder to ensure the uniqueness of the elements 
import java.util.HashSet;

  /*349. INTERSECTION OF TWO ARRAYS    ( LEETCODE )
     * Given two integer arrays nums1 and nums2, return an array of their intersection. 
     * Each element in the result must be unique and you may return the result in any order.
     * 
     * Example 1 : Input: nums1 = [1,2,2,1], nums2 = [2,2]      Output: [2]
     * Example 2 : Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]  Output: [9,4]
                                                                Explanation: [4,9] is also accepted.
     */


public class intersectionOfTwoArrays {
   
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1,nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
    public static int[] intersection(int[] nums1, int[] nums2){

        HashMap<Integer, Integer> map = new HashMap();
        Set<Integer> result = new HashSet();

        //Adding the elements of nums1 array into the hashmap
        for( int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //Adding the elements of nums2 array into the hashmap 
        for( int i : nums2){
                if(map.containsKey(i) && map.get(i)>0){
                    result.add(i);
                    map.put(i,map.get(i)-1);
                }
        }
        
        int[] res = new int[result.size()];
        int index = 0;
        for(int i : result){
            res[index]= i;
            index++;
        }

        return res;

    }
}
