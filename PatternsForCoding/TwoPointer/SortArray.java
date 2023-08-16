package PatternsForCoding.TwoPointer;

public class SortArray {
    public static int[] DutchNationalFlag(int[] nums){
        int left =0;
        int right =nums.length-1;
        int start =0;
       
        while(start<=right){
            if(nums[start]==0){
               int temp = nums[start];
                nums[start] =nums[left];
                nums[left] = temp;
                start++;
                left++;
            }
            else if(nums[start]==2){
               int temp = nums[start];
                nums[start]= nums[right];
                nums[right]= temp;
                right--;
            }
            else if(nums[start]==1) {
                start++;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums ={1,0,0,2,0,1,2,0};
        for(int i: DutchNationalFlag(nums)){
            System.out.print(i+" ");
        }
    }
    
}