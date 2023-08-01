package Tree;

public class BinaryTreeUsingLinkedList {
    
    BinaryNode root;

    public BinaryTreeUsingLinkedList(){
        this.root =null;
    }

    //Preorder Traversal
    void PreOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }
}
