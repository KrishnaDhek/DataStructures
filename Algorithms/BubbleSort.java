package Algorithms;
// Stable, Inplace
//TC -O(n^2)
// use when space is concer

public class BubbleSort {
    public void BubbleSort(int[] arr){
        int len = arr.length;

        for(int i =0; i<len-1; i++){
            for(int j =0; j<len-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }

    }
    public void print(int[] arr){
        System.out.println("BubbleSort :");
        for(int i: arr){
            System.out.print(i +" ");
        }
        System.out.println(" ");

    }

    
}
