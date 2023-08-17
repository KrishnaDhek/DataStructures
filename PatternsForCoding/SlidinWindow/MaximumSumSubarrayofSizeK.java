package PatternsForCoding.SlidinWindow;

public class MaximumSumSubarrayofSizeK {
    public static int MaxSumSubArray(int[] num,int k){

        int start =0;
        int max = 0;
        int sum =0;

        for(int i=0; i<num.length; i++){
            sum +=num[i];

            if(i>=k-1){
                max = Math.max(max, sum);
                sum -=num[start];
                
                start++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 5};
        int k =2;
        System.out.println(MaxSumSubArray(nums, k));
    }
}
