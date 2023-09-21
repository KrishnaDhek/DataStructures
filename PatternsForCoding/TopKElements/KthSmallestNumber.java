package PatternsForCoding.TopKElements;

import java.util.PriorityQueue;

public class KthSmallestNumber {
    public static int kthSmallest(int[] nums, int k){
        PriorityQueue<Integer> p= new PriorityQueue<>((a,b)-> b-a);

        for(int i: nums){
            p.offer(i);

            if(p.size()>k){
                p.remove();
            }
        }
        return p.peek();


    }
    public static void main(String[] args) {
        int[] nums = {9,7,5,3,8,6,2,1};
        System.out.println(kthSmallest(nums, 4));
    }
    
}
