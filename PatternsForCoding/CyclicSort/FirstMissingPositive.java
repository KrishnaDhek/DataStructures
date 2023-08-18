package PatternsForCoding.CyclicSort;

public class FirstMissingPositive {
    public static int FirstMissingPositive(int[] nums){
        int i =0;
        while(i<nums.length){
            int pos  = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[pos]){
                swap(nums, i, pos);
            }
            else{
                i++;
            }
        }
        for(int j =0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;

    }
    public static void swap(int[] nums, int i, int pos){
        int temp =nums[i];
        nums[i] =nums[pos];
        nums[pos] =temp;
    }
    public static void main(String[] args) {
        int[] nums= {7,8,9,10};
        System.out.println(FirstMissingPositive(nums));
    }
    
}
