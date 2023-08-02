package Array;

public class BinaryTreeMain {
   public static void main(String[] args) {
    BinaryTreeUsingArray tree = new BinaryTreeUsingArray(7);
    tree.insertInBinaryTree(1);
    tree.insertInBinaryTree(2);
    tree.insertInBinaryTree(3);
    tree.insertInBinaryTree(4);
    tree.insertInBinaryTree(5);
    tree.insertInBinaryTree(6);
    tree.insertInBinaryTree(7);
    tree.insertInBinaryTree(8);
    System.out.println("PreOrder Traversal :");
    tree.preOrderTraversal(1);
    System.out.println();
    System.out.println("PostOrder Traversal :");
    tree.postOrderTraversal(1);
    System.out.println();
    System.out.println("InOrder Traversal :");
    tree.inOrederTraversal(1);
    System.out.println();
     System.out.println("LevelOrder Traversal :");
    tree.levelOrderTraversal();
    System.out.println();


    

   }
    
    
}
