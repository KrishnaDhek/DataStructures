// LeetCode 287. Find the Duplicate Number
// Given an array of integers nums containing n + 1 integers where each integer is in the range
// [1, n] inclusive.There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.
package PatternsForCoding.TwoPointer;

public class FindDuplicateValue {
    public static int duplicateNum(int[] num){
        int slow = num[0];
        int fast = num[0];
        //detect cycyle
        do{
            slow = num[slow];//update with the slow value, e.g. slow = nums[0]->slow = 3;
            fast = num[num[fast]];//update eith the value, e.g fast = num[nums[0]]->fast = nums[3]->fast =4
        }while(slow!=fast);

        //get the duplicate value

        fast = num[0];
        while(slow!=fast){
            slow = num[slow];
            fast = num[fast];
        }
        return fast;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,2};
        int ans = duplicateNum(nums);
        System.out.println(ans);
    }
}
