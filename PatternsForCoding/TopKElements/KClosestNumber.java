package PatternsForCoding.TopKElements;

import java.util.ArrayList;
import java.util.List;

public class KClosestNumber {

    public static List<Integer> kClosest(int[] nums, int k, int x){

        int low =0; 
        int height = nums.length-k;// because we want to cover k elements

        while(low<height){
            int mid = (height-low)/2;

            if(x- nums[mid]> nums[mid+k]-x){
                low = mid+1;
            }
            else{
                height = mid;
            }
        }
            List<Integer> list = new ArrayList<>(k);

            for(int i=0; i<k; i++){
                list.add(nums[low+i]);
            }

            return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =4;
        int x =3;

        List<Integer> list = kClosest(arr, k, x);
        System.out.println(list);
    }
    
}
