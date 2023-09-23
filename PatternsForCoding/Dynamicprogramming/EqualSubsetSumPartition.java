package PatternsForCoding.Dynamicprogramming;

public class EqualSubsetSumPartition {
    public static boolean equalSum(int[] nums){
        int sum =0;
        for(int i: nums){
            sum+=i;
        }

        if(sum%2!=0)
            return false;

        return subsetSum(nums, sum/2);
    }

    private static boolean subsetSum(int[] a, int s){
        
    }
    public static void main(String[] args) {
        int[] nums ={1,5,11,5};
        System.out.println(equalSum(nums));
    }
    
}
