package PatternsForCoding.CyclicSort;

import java.util.List;

import Array.ArrayList;

public class FindAllNumbersDisappearedInArray {
    
    public static List<Integer> FindAllNumbersDisappearedInArray(int[] nums){
        int i =0;
        while(i<nums.length){
            int pos = nums[i]-1;
                if(nums[i]!=nums[pos]){
                    swap(nums, i, pos);
                }
                else{
                    i++;
                }
        }

        List<Integer> list = new java.util.ArrayList<>();
        for(int j =0; j<nums.length; j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;

    }

    public static void swap(int[] nums, int i, int pos){
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = FindAllNumbersDisappearedInArray(nums);
        System.out.println(list);
        
    }

}
