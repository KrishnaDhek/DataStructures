package PatternsForCoding.SlidinWindow;

public class LongestNiceSubarray {
    public static int LongestNiceSubarray(int[] nums){
        int start =0;
        int end =0;
        int maxLen =1;

        for(int i=0; i<nums.length; i++){
            // if the result is not equal to 0
            // perform xor operation so that we can shrink the window, by removing the elements from start
            // and increament the end to move to the next element
            while((start& nums[i])!=0){
                start ^=nums[end];
                end++;
            }
            // current element is added to start 
            start++;
            
            int curMax = i-end+1;
            maxLen = Math.max(maxLen, curMax);
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int[] nums= {1,3,8,48,10};
        System.out.println(LongestNiceSubarray(nums));
    }
    
}
