// LeetCode209
// Given an array of positive integers nums and a positive integer target, 
// return the minimal length of a subarray whose sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.


package LeetCodeSolutions;

public class SmallestSubArraySum {
    public static int SmallestSubArraySum(int[] nums, int s){
        int sum =0;
        int minSum = Integer.MAX_VALUE;
        int start =0;
        for(int i =0; i<nums.length; i++){
            sum +=nums[i];

            while(sum>=s){
                minSum = Math.min(minSum, i-start+1);

                sum -= nums[start];
                start++;
            }
        }
        if(minSum==Integer.MAX_VALUE){
            return 0;
        }
        else
            return minSum;
       
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 2, 3, 2};
        int sum =7;
        System.out.println(SmallestSubArraySum(nums, sum));
    }
    
}
