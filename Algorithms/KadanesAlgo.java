package Algorithms;
// the algorithm is elegant and is based on a simple idea: for every element in the array, 
// you calculate the maximum of either the current element itself or the current element
// added to the previous maximum subarray sum.



public class KadanesAlgo {
    public static int KadanesAlgo(int[] nums){
        int max =0;
        int currentmax =0;

        for(int i=0; i<nums.length; i++){
            currentmax = Math.max(currentmax+nums[i], nums[i]);
            max = Math.max(currentmax, max);
        }

        return max;

    }
    public static void main(String[] args) {
        int[] nums= {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(KadanesAlgo(nums));
    }
    
}
