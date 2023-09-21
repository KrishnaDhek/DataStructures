package PatternsForCoding.TopKElements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKElements(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));

        for(int i: map.keySet()){
            p.offer(i);

            if(p.size()>k){
                p.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] =p.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums= {2,3,4,5,5,6,7,8,8,5,2,5,1,2,8};
       int[] ans = topKElements(nums,3);

       for(int i:ans){
        System.out.print(i+" ");
       }
    }
    
}
