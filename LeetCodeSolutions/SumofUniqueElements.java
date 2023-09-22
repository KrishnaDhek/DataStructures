package LeetCodeSolutions;

import java.util.HashMap;
import java.util.List;

public class SumofUniqueElements {
    public static int sumOfUnique(int[] n){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : n){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

    }
    public static void main(String[] args) {
        int[] n ={2,3,2,4,5,5,1,7};
        System.out.println(sumOfUnique(n));
    }
    
}
