// LeetCode387
// Given a string s, find the first non-repeating character in it and return its index. 
// If it does not exist, return -1.

package LeetCodeSolutions;

import java.util.HashMap;

public class FirstUniqueCharInString {
    public static int UniqueChar(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(char i =0;i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "Krishna";
        int ans  = UniqueChar(s);
        System.out.println(ans);
    }
}
