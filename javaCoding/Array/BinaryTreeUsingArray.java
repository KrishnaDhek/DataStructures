package Array;

public class BinaryTreeUsingArray {
    int[] arr;
    public int lastUsedIndex;
    
   public BinaryTreeUsingArray(int size){
    arr = new int[size+1];
    lastUsedIndex =0;
    System.out.println("A blank Binary Tree is created with size = "+size);
   }

   //check ifFull

   public boolean isFull(){
    if(arr.length-1 == lastUsedIndex){
        return true;
    }
    return false;
   }
    

   //insert in Binary Tree

   public void insertInBinaryTree(int value){
    if(!isFull()){
        arr[lastUsedIndex+1] = value;
        lastUsedIndex++;
        System.out.println("Successfully inserted value"); 
    }
    else{
        System.out.println("Binary Tree is full!");
    }
   }

   //preOrderTraversal method 
   public void preOrderTraversal(int index){
    if(index>lastUsedIndex){
        return;
    }
    System.out.print(arr[index]+ " " );
    preOrderTraversal(index*2);
    preOrderTraversal(index*2 +1);
   }

   //postOrderTraversal 
   public void postOrderTraversal(int index){
    if(index>lastUsedIndex){
        return;
    }
    postOrderTraversal(index*2);
    postOrderTraversal(index*2 +1);
    System.out.print(arr[index]+ " ");
   }

   //inOrederTraversal method
   public void inOrederTraversal(int index){
    if(index>lastUsedIndex){
        return;
    }
    inOrederTraversal(index*2);
    System.out.print(arr[index] +" ");
    inOrederTraversal(index*2+1);
   }

   //levelOrderTraversal method
   public void levelOrderTraversal(int index){
    for(int i =1; i<=lastUsedIndex; i++){
        System.out.print(arr[i]+" ");
    }
    
   }
}
