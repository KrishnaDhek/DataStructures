package PatternsForCoding.SlidinWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindingAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        // a map to count the frequency of each character in the string p
        HashMap<Character,Integer> pMap = new HashMap<>();
        for(char c : p.toCharArray()){
            if(pMap.containsKey(c)){
                pMap.put(c, pMap.get(c)+1);
            }
            else{
                pMap.put(c, 1);
            }
        }
        // another map to keep the count of each character in the string s
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            sMap.put(ch, sMap.getOrDefault(ch, 0)+1);
            // if the window size is larger than the size of string 'p', we need to remove element from the start
            if(i>=p.length()){
                // get the character from the starting, so that we can slid our window
                char start = s.charAt(i-p.length());
                // once we get the char we need to decrese its frequency
                sMap.put(start, sMap.get(start)-1);
                // ass soon the frequency is 0, we remove that element
                if(sMap.get(start)==0){
                    sMap.remove(start);
                }
            }
            //compare the frequency of both the maps
            // If they're identical, it means the current window in s is an anagram of p
            if(pMap.equals(sMap)){
                // add the starting index of this window to result
                result.add(i-p.length()+1);
            }

        }
        return result;
        
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "c";
        // List<Integer> list = findAnagrams(s, p);
        System.out.println(findAnagrams(s, p));
    }
    
}
