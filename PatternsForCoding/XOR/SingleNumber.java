package PatternsForCoding.XOR;

public class SingleNumber {
    public static int num(int[] nums){
        int result =0;
        for(int i: nums){
            result^=i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums ={2,2,1,1,4,6,6,7,7,4,9,8,9};
        System.out.println(num(nums));
    }
}
