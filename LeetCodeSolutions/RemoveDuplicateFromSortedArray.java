package LeetCodeSolutions;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums){
        if(nums.length<2){
            return nums.length;
        }
        int i =1;
        for(int j =2; j<nums.length; j++){
            if(nums[j]!=nums[i-1]){
                nums[++i] = nums[j];
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
        int[] nums ={0,0,0,1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    
}
