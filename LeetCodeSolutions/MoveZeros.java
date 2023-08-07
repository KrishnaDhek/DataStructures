// LeetCode283
// Given an integer array nums, move all 0's to the end of it while maintaining
//  the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.


package LeetCodeSolutions;
public class MoveZeros {
    public static void MoveZeros(int[] nums){
        int i = 0;
        int j = 1;
        while(j<nums.length){
            if(nums[i]==0&&nums[j]!=0){
                int temp = nums[i];
                nums[i] =nums[j];
                nums[j] =temp;
                i++;
                j++;
            }
            else if(nums[i]==0&&nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0,9,7};
        MoveZeros(nums);
        for(int i: nums){
            System.out.print(i+ ",");
        }
    }
    
}
