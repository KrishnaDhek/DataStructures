package Algorithms;
// time complaxity- O(nlogn)
// space complexity- O(n)
// stable
// not inplace

public class MergeSort {
   public static void merge(int[] a, int left, int mid, int right){
    // split array from left to mid, adding 2 so that we need not to worry about out of bounds
    int[] l = new int[mid-left+2];
    // split array from mid+1 toright
    int[] r = new int[right-mid+1];
    // copy value to the templeft 
    for(int i=0; i<=mid-left+1; i++){
        l[i] = a[left+i];
    }
    //copy value  
    for(int i =0; i<right-mid; i++){
        r[i] = a[mid+1+i];
    }
    //addiing max values at the end of each subarray, so that we dont acess out-of-bound elements
    //these values will remain in the temp array, and will not appear in the final array.
    // they act as 
    l[mid-left+1] = Integer.MAX_VALUE;
    r[right-mid] = Integer.MAX_VALUE;

    int i =0; 
    int j=0;
    //merger operation, to combine the left and right subarray  
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
        // recursively sort left half
        mergeSort(a, left, mid);
        // recursively sort right half
        mergeSort(a,mid+1, right);
        // after both the parts have been sorted, we call merge method that will combine the sorted half
        // to a single array
        merge(a, left, mid, right);

    }
   }

    public static void print(int [] arr) {
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
