package PatternsForCoding.SlidinWindow;

public class MinimumSizeSubarraySum {
    public static int minSubarray(int[] nums, int target){
        int start =0;
        int minLen = Integer.MAX_VALUE;
        int sum =0;
        for(int i =0; i<nums.length; i++){
            sum +=nums[i];

            while(sum>=target){

                int len = i-start+1;
                minLen = Math.min(minLen, len);

                sum-=nums[start];
                start++;
            }

        }

        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLen;
        }

    }
    public static void main(String[] args) {
        int[] nums= {2,3,1,2,4,3};
        int target =7;
        System.out.println(minSubarray(nums, target));
    }
    
}
