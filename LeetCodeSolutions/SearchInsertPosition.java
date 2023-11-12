// LeetCode 35.
// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. If not,
//  return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.


package LeetCodeSolutions;

public class SearchInsertPosition {
    public static int SearchInsertPosition(int[] nums, int target){
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int  mid  = (left+right) / 2;
            if(target==nums[mid]){
                return mid;
            }
           else if(target>nums[mid]){
                left = mid+1;
           }
           else{
                right = mid-1;
           }
        }
        return left;

    }
    public static void main(String[] args) {
        int[] nums = {2,37,8,9,10,13,20,21};
        int target = 4;
       System.out.println(SearchInsertPosition(nums, target)); 
    }
    
}
