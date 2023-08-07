// LeetCode 11
// You are given an integer array height of length n. 
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) 
// and (i, height[i]). Find two lines that together with the x-axis form a container, 
// such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

package LeetCodeSolutions;

public class ContainerWithMostWater {
    public static int ContainerWithMostWater(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int maxWater =0;
        while(left<right){
            int minHeightLeft = arr[left];
            int minHeightRight = arr[right];
            int minHeight = Math.min(minHeightLeft, minHeightRight);
            maxWater = Math.max(maxWater, minHeight*(right-left));
            if(minHeightLeft<minHeightRight){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7,9,12};
        System.out.println(ContainerWithMostWater(arr));
        
       
       

    }
    
}
