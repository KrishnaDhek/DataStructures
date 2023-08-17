package PatternsForCoding.SlidinWindow;

public class SmallestSubArrayWithAGivenSum {

    public static int SmallestSubArraySum(int[] num, int k){
        int minLen = Integer.MAX_VALUE;
        int start =0;
        int sum =0;
        for(int i= 0;i<num.length; i++){
            sum +=num[i];

            while(sum>=k){
                minLen = Math.min(minLen, i-start+1);
                sum -= num[start];
                start++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        else {
            return minLen;
        }

    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 2, 3, 2};
        int sum = 10;
        System.out.println("Tne smallest subarray the is greater then or equal to the given sum "+sum+ " is " +SmallestSubArraySum(nums, sum));
    }
    
}
