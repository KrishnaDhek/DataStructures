package LeetCodeSolutions;

import java.util.HashMap;

public class MajorityElement {
    public static int majorElement(int[] nums){

        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        for(int i: map.keySet()){
            if (map.get(i)> nums.length/2) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums= {4,5,4,5,5,4,5,4,5};

        System.out.println("The element which appreared more than n/2 times is :" +majorElement(nums));
    }
}
