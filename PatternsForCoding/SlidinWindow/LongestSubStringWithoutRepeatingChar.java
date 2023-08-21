package PatternsForCoding.SlidinWindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static int lengthOfLongestSubstring(String s){
        int start =0;
        int end =0;
        int maxLen =0;

        HashSet<Character> hset = new HashSet<>();

        while(end<s.length()){
            if(!hset.contains(s.charAt(end))){
                hset.add(s.charAt(end));
                end++;
                maxLen = Math.max(hset.size(), maxLen);
            }
            else{
                hset.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        String s = "abcabcbacezb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    
}
