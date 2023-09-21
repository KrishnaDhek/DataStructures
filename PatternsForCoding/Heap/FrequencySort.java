package PatternsForCoding.Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySort {
    public static String freqSort(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        PriorityQueue<Character> p = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a) );

            p.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while(!p.isEmpty()){
            char ch = p.poll();
            int count = map.get(ch);

            for(int i=0; i<count; i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "potato";
        System.out.println(freqSort(s));
    }
    
}
