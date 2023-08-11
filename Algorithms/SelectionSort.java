package Algorithms;
// Inplace but not Stable
// TC :O(N^2)
public class SelectionSort {
    public void SelectionSort(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[j]<arr[min])
                min = j;
            }
        
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] =temp;
        }
    }
    public void print(int[] arr){
        System.out.println("SelectionSort : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
}
