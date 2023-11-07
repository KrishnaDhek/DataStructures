package Algorithms;

public class MergeSortRecursive {
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
