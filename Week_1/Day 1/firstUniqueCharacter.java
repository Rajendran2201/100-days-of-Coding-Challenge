/*
 * 387. FIRST UNIQUE CHARACTER IN A STRING    ( LEETCODE )
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * Example 1: "leetcode"        Output:0
 * Example 2: "loveleetcode"    Output:2
 * Example 3: "aabb"            Output:-1
 */

import java.util.HashMap;
public class firstUniqueCharacter {
    public static void main(String[] args){
        String s = "loveleetcode";
        int res = firstUniqChar(s);
        System.out.println(res);
    }
    public static int firstUniqChar(String s) {
       HashMap<Character, Integer> map = new HashMap();
       // Storing the characters of the string in a hashmap such that their values are 1. 
       // If the same character appears again,then we calculate value = prevcharindex + 1 which is basically equal to the number of occurrences of the character in the string 
       // If the character occurs more than one time, it is not under our concern so never mind what vakue it's gonna have just make sure that I doesn't have 1 
       for(int i=0;i<s.length();i++){
        char a = s.charAt(i);
        if(map.containsKey(a)){
            map.put(a,map.get(a)+1);
        }else{
            map.put(a,1);
        }
       }
       // Traversing the Hashmap to find the first unique character 
       for(int i=0;i<s.length();i++){
        char a = s.charAt(i);
        if(map.get(a)==1){
            return i;
        }
       }
       return -1;
}

}
