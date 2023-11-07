package Algorithms;

public class MergeSortRecursive {
    public static void main(String[] args) {
        int[] a ={23,0,98,76,4,0,56,7,82,2,54,3,4,169,1,6,9,2};
        int low = 0;
        int high = a.length-1;
// call to merge sort function
        mergeSort(a, low, high);
    }
    
}
