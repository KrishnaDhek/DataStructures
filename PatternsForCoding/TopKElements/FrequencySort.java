package PatternsForCoding.TopKElements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {
    public static String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        PriorityQueue<Character> p = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));

        p.addAll(map.keySet());
        
    }
    public static void main(String[] args) {
        String s = "teeth";
        System.out.println(frequencySort(s));
    }
}
