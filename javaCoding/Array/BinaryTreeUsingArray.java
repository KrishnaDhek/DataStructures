package Array;

public class BinaryTreeUsingArray {
    int[] arr;
    public int lastUsedIndex;
    
   public BinaryTreeUsingArray(int size){
    arr = new int[size+1];
    lastUsedIndex =0;
    System.out.println("A blank Binary Tree is created with size = "+size);
   }
    
}
