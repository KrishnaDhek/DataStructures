package PatternsForCoding.CyclicSort;

public class SetMisMatch {
    public static int[] SetMisMatch(int[] nums){
        int i =0;
        while(i<nums.length){
            int pos = nums[i]-1;
            if(nums[i]<nums.length &&nums[i]!=nums[pos]){
                swap(nums, i, pos);
            }
            else{
                i++;
            }
        }

        for(int j =0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};

    }
    public static void swap(int[] nums, int i, int pos){
        int temp = nums[i];
        nums[i] =nums[pos];
        nums[pos] =temp;
    }

    public static void main(String[] args) {
        int[] nums ={1,5,6,7,7,2,3,4};
        int[] a = SetMisMatch(nums);
        for(int i: a)

        System.out.print(i+" ");
    }
    
}
