package PatternsForCoding.TopKElements;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int kthLargest(int[] nums, int k){
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b)-> b-a);

        for(int i :nums){
            p.offer(i);
        }
        int ans=0;
        for(int i=0; i<k; i++){
            ans =p.poll();
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {9,2,5,8,1,7,3,6,10,12};
        System.out.println(kthLargest(nums,4));


    }
    
}
