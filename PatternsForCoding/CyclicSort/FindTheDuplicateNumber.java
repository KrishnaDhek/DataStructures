package PatternsForCoding.CyclicSort;

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
