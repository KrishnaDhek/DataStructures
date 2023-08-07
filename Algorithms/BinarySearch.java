package Algorithms;

public class BinarySearch {
    public static int BinarySearch(int[] nums, int target){
        int left = 0;
        int  right = nums.length-1;
        while(left<=right){
            int mid = (left+right) / 2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums ={7,9,10,44,56,62,77,100};
        int target = 56;
        System.out.println(BinarySearch(nums, target));
    }

    
}
