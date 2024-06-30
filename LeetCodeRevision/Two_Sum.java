package LeetCodeRevision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 */
public class Two_Sum {
    public static int[] two_sum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                ans[0] =i;
                ans[1] = map.get(arr[i]);
            }else{
                map.put(target-arr[i],i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr= new int[len];

        for (int i=0; i<len; i++){
            arr[i] =scanner.nextInt();
        }
        for (int i=0; i<len;i++){
            System.out.print(arr[i]+" ");
        }
        int target = scanner.nextInt();
        int [] ans =two_sum(arr,target);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
