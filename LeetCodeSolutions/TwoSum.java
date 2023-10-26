// LeetCode 1 Two sum
// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.
// You can return the answer in any order.
package LeetCodeSolutions;

import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSum(int[] nums, int target){
        int[] ans = new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                ans[0]=i;
                ans[1] =map.get(nums[i]);
                return ans;
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int[] nums= {2,11,17,7,5};
        int target = 9;
        int[] ans = TwoSum(nums,target );
        for(int i :ans){
            System.out.println(i);
        }
    }
    
}
