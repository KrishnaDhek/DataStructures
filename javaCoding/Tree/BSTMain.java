package Tree;

public class BSTMain {
    public static void main(String[] args) {
    
    BinarySearchTree BST = new BinarySearchTree();
    BST.insert(70);
    BST.insert(90);
    BST.insert(50);
    BST.insert(60);
    BST.insert(40);
    BST.insert(100);   
    BST.insert(30);
    BST.insert(20);
    BST.insert(10);
    System.out.println("Pre-Order Traversal of Binary Search Tree :");
    BST.preOrderTaversal(BST.root);
    System.out.println(" ");
    System.out.println("In-Order Traversal of Binary Search Tree :");
    BST.inorderTraversal(BST.root);
    System.out.println(" ");
    System.out.println("Post-Order Traversal of Binary Search Tree :");
    BST.postOrderTaversal(BST.root);
    }
   
    
}
