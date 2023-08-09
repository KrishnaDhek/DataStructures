// LeetCode 54.SpiralMatrix
// Given an m x n matrix, return all elements of the matrix in spiral order.
package LeetCodeSolutions;
import java.util.ArrayList;
public class SpiralMatrix {
    public static ArrayList<Integer> PrintSpiral(int[][] matrix){
        int Top =0;
        int Left =0;
        int Right =matrix[0].length-1;
        int Bottom = matrix.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(Left<=Right && Top<=Bottom ){
            for(int i =Left; i<=Right; i++){
                list.add(matrix[Top][i]);
            }
            Top++;

            for(int i= Top; i<=Bottom; i++){
                list.add(matrix[i][Right]);
            }
            Right--;

            if(Left<=Right){
                for(int i =Right; i>=Left; i--){
                    list.add(matrix[Bottom][i]);
                }
            }
            Bottom--;

            if(Top<=Bottom){
                for(int i=Bottom; i>=Top; i--){
                    list.add(matrix[i][Left]);
                }
                Left++;
            }
        }
        return list;

    }
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

        ArrayList<Integer> list = PrintSpiral(matrix);
        System.out.println(list);
        
    }
    
}
