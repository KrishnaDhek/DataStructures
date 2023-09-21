package PatternsForCoding.Heap;

import java.util.PriorityQueue;

public class KthSmallestElementInArray {
    public static int kthSmallest(int[] nums, int k){
        PriorityQueue<Integer>p = new PriorityQueue<>((a,b)-> b-a);

        for(int i :nums){
            p.offer(i);

            if(p.size()>k){
                p.remove();
            }
        }
        return p.peek();
    }
    public static void main(String[] args) {
        int[] nums ={2,5,7,8,9,90,98,89,134,6};
        System.out.println(kthSmallest(nums, 6));
    }
    
}
