// LeetCode 189. Rotate Array
// Given an integer array nums, rotate the array to the right by k steps, 
// where k is non-negative
package LeetCodeSolutions;

public class RotateArray {

    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }
    public static void RotateArray(int[] arr, int k){
        int start =0;
        int end =arr.length-1;
        k = k%(arr.length);
        int j = k-1;

        reverseArray(arr, start, end);//reverse the entire array
        reverseArray(arr, start, j);//reverse first half
        reverseArray(arr, k, end);//revrse second half

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,95,125,469,6,81};
        int k =3;
        RotateArray(arr, k);

        for(int i: arr){
            System.out.print(i +" ");
        }
        System.out.println(" ");
    }
    
}
