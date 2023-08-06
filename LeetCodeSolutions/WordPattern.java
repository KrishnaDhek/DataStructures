// Leetcode 290
// Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between
//  a letter in pattern and a non-empty word in s.

package LeetCodeSolutions;

import java.util.HashMap;

public class WordPattern {
    public static boolean WordPattern(String pattern, String s){
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length())
            return false;
        HashMap<Character,String> map = new HashMap<Character,String>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(arr[i]))
                    return false;
                map.put(pattern.charAt(i), arr[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "dog cat dog cat dog";
        String patten = "ababa";
        System.out.println(WordPattern(patten, s));
    }
}
