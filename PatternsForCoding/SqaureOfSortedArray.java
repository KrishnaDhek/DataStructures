// 977 Sqaure of Sorted array
// Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
package PatternsForCoding;

public class SqaureOfSortedArray {
    public static int[] SqaureOfSortedArray(int[] nums){
        int[] result = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int i=nums.length-1;
        while(left<=right){
            int leftValue = nums[left]*nums[left];
            int rightValue = nums[right]*nums[right];

            if(leftValue>rightValue){
                result[i] = leftValue;
                left++;
            }
           else{
                result[i] =rightValue;
                right--;
           } 
           i--;
        }
        
        return result;
    }
    

    
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
       int[] result= SqaureOfSortedArray(nums);
       for(int i :result){
        System.out.print(i +" ");
       }
    
 }
}
