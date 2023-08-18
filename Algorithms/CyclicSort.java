package Algorithms;

public class CyclicSort {
    public static void CyclicSort(int[] nums){
        int i =0;
        while(i<nums.length){
            int cpos = nums[i]-1;
            if(nums[i]<nums.length && nums[i]!= nums[cpos]){
                swap(nums, i, cpos);
            }
            else{
                i++;
            }
        }

    }

    public static void swap(int[] num, int i, int cpos){
        int temp = num[i];
        num[i] = num[cpos];
        num[cpos] =temp;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        System.out.println("Array before performing CyclicSort");
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        CyclicSort(nums);
         System.out.println("Array after performing CyclicSort");
        for(int i :nums){
            System.out.print(i+" ");
        }
    }
}