package Algorithms;

public class Main {
    public static void main(String[] args) {
        // BubbleSort bSort = new BubbleSort();
        // int[] arr = {10,5,5,3,6,9,2,1};
        // bSort.BubbleSort(arr);
        // bSort.print(arr);
        // SelectionSort selectionSort = new SelectionSort();
        // selectionSort.SelectionSort(arr);
        // selectionSort.print(arr);
        // InsertionSort insertionSort  = new InsertionSort();
        // insertionSort.InsertionSort(arr);
        // insertionSort.print(arr);

       
        int[] arr ={10,3,2,5,8,4,3,1,2,9,7,8};
        MergeSort.mergeSort(arr, 0, arr.length-1);
        MergeSort.print(arr);
       
  
        
}
}
