package PatternsForCoding.TopKElements;

import java.util.List;

public class KClosestNumber {

    public static List<Integer> kClosest(int[] nums, int k, int x){

        int low =0; 
        int height = nums.length-k;

        while(low<height){
            int mid = low+(height-low)/2;

            if(x- nums[mid]> nums[mid+k]-k){
                low = mid+1;
            }
            else{
                height = mid;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =4;
        int x =3;

        List<Integer> list = kClosest(arr, k, x);
    }
    
}
