package Tree;


public class BirnaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeUsingLinkedList binaryTree = new BinaryTreeUsingLinkedList();
        binaryTree.InsertionInBinaryTree("N1");
        binaryTree.InsertionInBinaryTree("N2");
        binaryTree.InsertionInBinaryTree("N3");
        binaryTree.InsertionInBinaryTree("N4");
        binaryTree.InsertionInBinaryTree("N5");
        binaryTree.InsertionInBinaryTree("N6");
        binaryTree.InsertionInBinaryTree("N7");
        binaryTree.InsertionInBinaryTree("N8");
        binaryTree.InsertionInBinaryTree("N9");
        binaryTree.InsertionInBinaryTree("N10");
        binaryTree.LevelOrderTraversal();
        System.out.println("\n");
        System.out.println("Pre-Order Traversal of Binary Tree :");
        binaryTree.PreOrderTraversal(binaryTree.root);
        System.out.println("\n");
        System.out.println("Post-Order Traversal of Binary Tree :");
        binaryTree.PostOrderTraversal(binaryTree.root);
        System.out.println("\n");
        System.out.println("In-Order Traversal of Binary Tree :");
        binaryTree.InorderTraversal(binaryTree.root);
        System.out.println("\n");
        System.out.println("Level-Order Traversal of Binary Tree :");
        binaryTree.LevelOrderTraversal();
        System.out.println("\n");
        binaryTree.Search("N5");
        binaryTree.Search("N12");
        System.out.println(binaryTree.getDeepesBinaryNode().value);

    }
    
}
