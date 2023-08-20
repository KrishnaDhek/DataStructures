package PatternsForCoding.CyclicSort;
// Given an array of integers nums containing n + 1 integers where each integer
//  is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.
public class FindTheDuplicateNumber {
    public static int FindTheDuplicateNumber(int[] nums){
        int i =0; 
        while(i<nums.length){
            if(nums[i]!=i+1){
                int pos = nums[i]-1;
                if(nums[i]!=nums[pos]){
                    swap(nums, i, pos);
                }
                else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return-1;

    }
    public static void swap(int[] num, int i, int pos){
        int temp = num[i];
        num[i] = num[pos];
        num[pos] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(FindTheDuplicateNumber(nums));
    }
    
}
