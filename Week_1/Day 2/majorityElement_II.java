import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement_II {
    /*
     * 229. MAJORITY ELEMENT - II 
     * 
     * Given an array nums of size n, return the majority element
     * The majority element is the element that appears more than ⌊n / 3⌋ times. You may assume that the majority element always exists in the array.
     * 
     * Example 1 : Input: nums = [3,2,3]                Output: [3]
     * Example 2 : Input: nums = [1]                    Output: [1]
     * Example 3 : Input: nums = [1,2]                  Output: [1,2]
     */
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int majority = majorityElement(nums);
        System.out.println(majority);
    }
    public static List<Integer> majorityElement(int[] nums) {
        
         HashMap<Integer,Integer> map = new HashMap();
        int size = nums.length/3;
        // Since the element should appear more than size/3 times 
        for(int i=0; i<nums.length;i++){
                int a = nums[i];
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put(a,1);
                }
        }
        
        ArrayList<Integer> list = new ArrayList<>();


        for(int i : map.keySet()){ //keySet() is used to iterate the entire map somthing like a foreach loop 
            int a = map.get(i);
            if(a>size){
                list.add(i);
            }
        }

        return list;
    }
    
}
