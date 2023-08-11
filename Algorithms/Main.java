package Algorithms;

public class Main {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        int[] arr = {10,5,5,3,6,9,2,1};
        bSort.BubbleSort(arr);
        bSort.print(arr);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.SelectionSort(arr);
        selectionSort.print(arr);
        InsertionSort insertionSort  = new InsertionSort();
        insertionSort.InsertionSort(arr);
        insertionSort.print(arr);
    }
    
}
