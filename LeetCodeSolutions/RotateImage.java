// LeetCode48
// You are given an n x n 2D matrix representing an image, 
// rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix
//  directly. DO NOT allocate another 2D matrix and do the rotation.
package LeetCodeSolutions;

public class RotateImage {
    public static void RotateImage(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j =i+1; j<mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] =temp;
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j =0; j<mat.length/2; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length-j-1];
                mat[i][mat.length-j-1] = temp;

            }
        }

    }
    public static void main(String[] args) {
        int[][] mat ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,17}};
        RotateImage(mat);
        System.out.println(mat.length);
        for(int[] i: mat){
            for(int j : i)
            System.out.print(j+" ");
        }
    }
    
}
