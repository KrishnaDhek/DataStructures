package PatternsForCoding.K_WayMerge;

public class KthSmallestElementinASortedMatrix {
    public static int kthSmallestInMatrix(int[][] matrix, int k){
        int low =matrix[0][0];
        int hight = matrix[matrix.length-1][matrix.length-1];

        while(low<hight){
            int mid = low+(hight-low)/2;

            int countVal = countNum(matrix, mid);

            if(countVal<k){
                low = mid+1;
            }
            else{
                hight = mid;
            }
        }
        return low;
    }

    private static int countNum(int[][] matrix, int mid){
        int count = 0;
        int j = matrix.length-1;

        for(int i=0; i<matrix.length; i++){
            while(j>=0 && matrix[i][j]>mid){
                j--;
            }

            count +=(j+1);
        }

        return count;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        int k = 6;
        System.out.println(kthSmallestInMatrix(matrix,k));
    }
    
}
