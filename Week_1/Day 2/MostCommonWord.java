import java.util.HashMap;
/*
 * 819. MOST COMMON WORD     ( LEETCODE )
 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. 
 * It is guaranteed there is at least one word that is not banned, and that the answer is unique.

    The words in paragraph are case-insensitive and the answer should be returned in lowercase. (punctuation is ignored)

    Example 1:  Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit." 
                banned = ["hit"]
                Output: "ball"  
    
    Example 2:  Input: paragraph = "a."
                banned = []
                Output: "a"
 */

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String ans = mostCommonWord(paragraph,banned);
        System.out.println(ans);
    }
    public static String mostCommonWord(String paragraph, String[] banned){
        //Splitting the string into an array which doesnot contain any non-words(Symbols and punctuations) and spaces 
        String[] str = paragraph.toLowerCase().split("[!?',; .]+");
        HashMap<String,Integer> map = new HashMap();
        //Adding the Words into the Hashmap and incrementing their value on encountering their duplicate 
        for(String i : str){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //Removing the banned words from the HashMap
        for(String i : banned){
            map.remove(i);
        }
        //The key in the hashmap having the maximum value is our answer 
        int max = Integer.MIN_VALUE;
        String ans = "";
        for(String i : map.keySet()){
            if(max<map.get(i)){
                max = map.get(i);
                ans = i;
            }
        }
        return ans;
    }
}
