package PatternsForCoding.Heap;

import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static int kthLargestEle(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i: nums){
            pq.offer(i);

            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums= {2,5,7,8,9,90,98,89,134,6};
        System.out.println(kthLargestEle(nums,6));
    }
}
