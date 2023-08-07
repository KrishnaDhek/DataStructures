// LeetCode215
// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?


package LeetCodeSolutions;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static int KthLargestElement(int[] nums, int k){
        // Arrays.sort(nums);
        // return nums[nums.length-k]; //O(NlogN)
        // 
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : nums){
            queue.add(i);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();

    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4,9,10,8};
        int k = 4;
        System.out.println(KthLargestElement(nums, k));
    }
    
}
