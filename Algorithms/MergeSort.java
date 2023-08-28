package Algorithms;

public class MergeSort {
   public static void merge(int[] a, int left, int mid, int right){
    // split array from left to mid
    int[] l = new int[mid-left+2];
    // split array from mid+1 toright
    int[] r = new int[right-mid+1];

    for(int i=0; i<=mid-left+1; i++){
        l[i] = a[left+i];
    }
    for(int i =0; i<right-mid; i++){
        r[i] = a[mid+1+i];
    }

    l[mid-left+1] = Integer.MAX_VALUE;
    r[right-mid] = Integer.MAX_VALUE;

    int i =0; 
    int j=0;

    for(int k =left; k<=right; k++){
        if(l[i]<r[j]){
            a[k] = l[i];
            i++;
        }else{
            a[k] = r[j];
            j++;
        }
    }

   }

 

   public static void mergeSort(int[] a, int left, int right){
    if(left<right){
        int mid = (left+right)/2;
        mergeSort(a, left, mid);
        mergeSort(a,mid+1, right);
        merge(a, left, mid, right);

    }
   }

    public static void print(int [] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
