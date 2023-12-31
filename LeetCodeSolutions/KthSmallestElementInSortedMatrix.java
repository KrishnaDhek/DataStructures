package LeetCodeSolutions;
// 378. Kth Smallest Element in a Sorted Matrix

// Given an n x n matrix where each of the "rows and columns" is "sorted in ascending order",
//  return the kth smallest element in the matrix.
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
// You must find a solution with a memory complexity better than O(n2).
public class KthSmallestElementInSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k){
        int low =matrix[0][0];
        int high =matrix[matrix.length-1][matrix.length-1];
        while(low<high){
            int  mid = low+(high-low)/2;
            int elementCount = count(matrix,mid);
            if(elementCount<k){
                low = mid+1;
                
            }else{
                high = mid;
            }
        }
        return low;

    }

    private static int count(int[][] m, int mid){
        int elementCount = 0;
        int row = m.length-1;
        int column = 0;

        while(row>=0&&column<m.length){
            if(m[row][column]<=mid){
                elementCount +=row+1;
                column++;
            }else
            row--;
        }
        return elementCount;
    }
    public static void main(String[] args) {
        int[][] matrix ={{1,5,9},{10,11,13},{12,13,15}};
        int k = 9;
        System.out.println(kthSmallest(matrix, k));
    }

    
}
