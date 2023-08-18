package PatternsForCoding.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static List<Integer> FindAllDuplicatesInArray(int[] nums){
        int i =0; 
        List<Integer> list  = new ArrayList<>();
        while(i<nums.length){
            int pos  = nums[i]-1;
            if(nums[i]!=nums[pos]){
                swap(nums, i, pos);
            }
            else{
                i++;
            }
        }

        for(int j =0; j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;

    }

    public static void swap(int[] nums, int i, int pos){
        int temp = nums[i];
        nums[i] = nums[pos];
        nums[pos] =temp;
    }
    public static void main(String[] args) {
        int[] nums ={1,1,2,3,4,5,5};
        List<Integer> list = FindAllDuplicatesInArray(nums);
        System.out.println(list);
    }
}
