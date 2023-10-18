import java.util.HashMap;

  /*
     * 169. MAJORITY ELEMENT      ( LEETCODE )
     * 
     * Given an array nums of size n, return the majority element
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
     * 
     * Example 1 : Input: nums = [3,2,3]                Output: 3
     * Example 2 : Input: nums = [2,2,1,1,1,2,2]        Output: 2
     */


public class majorityElement {
  
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int majority = majorityElement(nums);
        System.out.println(majority);
    }
    public static int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap();
        int size = nums.length/2;
        // Since the element should appear more than size/2 times 
        for(int i=0; i<nums.length;i++){
                int a = nums[i];
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a,1);
                }
        }
        for(int i : map.keySet()){
            int a = map.get(i);
            if(a>size){
                return i;
            }
        }

        return -1;
    }
    
}
