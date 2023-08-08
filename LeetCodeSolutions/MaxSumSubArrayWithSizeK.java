// Given an array of positive numbers and a positive number ‘k,’ 
// find the maximum sum of any contiguous subarray of size ‘k’.


package LeetCodeSolutions;

import java.util.Arrays;

public class MaxSumSubArrayWithSizeK {
    public static int MaxSumSubArrayWithSizeK(int[] arr, int k){

        int start =0;
        int maxSum = 0;
        int sum =0;
        int end =0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(i>=k-1){
                end =i;
                maxSum = Math.max(maxSum, sum);

                sum -=arr[start];
                start++;
                
            }
            
        }
        
        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
       int a = MaxSumSubArrayWithSizeK(arr, k);
       
        System.out.println("Maximum sum of subarray with windo size k is :" +a);
       
    }
    
}
