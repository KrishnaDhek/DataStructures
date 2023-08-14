// 3. Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without repeating characters.
package LeetCodeSolutions;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int LengthOfLongestSubString(String s){
        int start =0;//pointing at the first character of string
        int end =0;//pointer to move ahead
        int maxLen =0;//store maxLength
        HashSet<Character>  hset = new HashSet<>();//to check the uniqueness
        while(end<s.length()){
            if(!hset.contains(s.charAt(end))){//if hset does not has the char, then add
                hset.add(s.charAt(end));
                end++; //increament end pointer
                
                maxLen = Math.max(hset.size(), maxLen);//find the max length 
            }
            else{
                //it means the hset already contains the element 
                //so we'll have to remove the elements from hset 
                //and increament the start pointer

                hset.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
        

    }
    public static void main(String[] args) {
        String s = "mmnonbvklo";
        System.out.println(LengthOfLongestSubString(s));
    }
    
}
