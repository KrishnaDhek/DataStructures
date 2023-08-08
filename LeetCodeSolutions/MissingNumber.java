// 268 MissingNumber
// Given an array nums containing n distinct numbers in the range [0, n], 
// return the only number in the range that is missing from the array.


package LeetCodeSolutions;

public class MissingNumber {
    public static int MissingNumber(int[] arr){
        int ans =0;

        for(int res : arr){
            ans ^= res;
        }
        for(int i =0; i<=arr.length; i++){
            ans ^=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5};
        System.out.println(MissingNumber(arr));
    }
    
}
