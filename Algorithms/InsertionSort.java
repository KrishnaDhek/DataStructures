package Algorithms;

public class InsertionSort {
    public void InsertionSort(int[] arr){
        for(int  i =1 ; i<arr.length; i++){
            int temp = arr[i];
            int j = i;

            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j --;
            }
            arr[j] = temp;
        }

    }
    public void print(int[] arr){
        System.out.println("InsertionSort :");
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    
}
