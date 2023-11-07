package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSortRecursive {
    public static void merge(int[] a, int low, int mid, int high){
        // defined a temporary list
        List<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid+1;

// we will add the elements to the list till left <=mid and right<=high
        while (left<=mid && right<=high) {
            // add elements from the left, if less then right
            if(a[left]<=a[right]){
                list.add(a[left]);
                left++;
            }
            // else add elements from the right 
            else{
                list.add(a[right]);
                right++;
            }
        }
// if left half has still some element, directly copy them to list
        while (left<=mid) {
            list.add(a[left]);
            left++;
            
        }
// if right half has still some element, directly copy them to list

        while (right<=high) {
            list.add(a[right]);
            right++;
        }

        // copy back to the original array
        for(int i =low; i<=high; i++){
            a[i] = list.get(i-low);
        }
    }

    public static void mergeSort(int[] a, int low, int high){
        // Base case: If low is greater than or equal to high, the array is already sorted.
        if(low>=high){
            int mid = (low+high)/2;

            // recursively call merge sort for the left half
            mergeSort(a, low, mid);

            // recursively call merge sort for the right half
            mergeSort(a, mid+1, high);

            // Merge the two sorted halves together.
            merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] a ={23,0,98,76,4,0,56,7,82,2,54,3,4,169,1,6,9,2};
        int low = 0;
        int high = a.length-1;
// call to merge sort function
        mergeSort(a, low, high);
    }
    
}
