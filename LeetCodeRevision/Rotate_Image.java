package LeetCodeRevision;

import java.util.Scanner;

/**
 48. Rotate Image
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 */

public class Rotate_Image {
    public static void rotate_matrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for (int j=i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i] =temp;
            }
        }

        for (int i =0; i<matrix.length; i++){
            for (int j=0; j<matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] =temp;
            }
        }
        System.out.println("Matrix after rotation is: ");
        print_matrix(matrix);
    }
    public static void print_matrix(int[][] matrix){
        int len =matrix.length;
        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();
        int[][] matrix =new int[row][column];

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++ ){
                System.out.println("[ "+i+" ] [ "+j+" ]");
                matrix[i][j] =sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        print_matrix(matrix);
        rotate_matrix(matrix);


    }
}
