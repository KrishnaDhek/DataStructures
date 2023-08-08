// Given an unsorted array A of size N that contains only positive integers, 
// find a continuous sub-array that adds to a given number S and return the left and 
// right index(1-based indexing) of that subarray.
// In case of multiple subarrays, return the subarray indexes which come 
// first on moving from left to right.
// Note:- You have to return an ArrayList consisting of two elements left and right.
//  In case no such subarray exists return an array consisting of element -1.

package LeetCodeSolutions;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static ArrayList<Integer> SubArrayWithGivenSum(int[] arr, int s){
        int sum = 0;
        int start =0;
        ArrayList<Integer>list = new ArrayList<>();

        if(s==0){
            list.add(-1);
            return list;
        }
        for(int i =0; i<arr.length; i++){
            sum = sum+arr[i];

            while(sum>s){
                sum -=arr[start];
                start++;
            }
            
           
            if(sum==s){
                list.add(start+1);
                list.add(i+1);
                break;
            }
        }
        
        if(sum!=s){
                list.add(-1);
                return list;
            }

        return list;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int sum =15;
        ArrayList<Integer> list = SubArrayWithGivenSum(arr,sum);
        System.out.println(list);
        
    }
   
    
}
