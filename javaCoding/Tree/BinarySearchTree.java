package Tree;

public class BinarySearchTree {
    BSTNode root;

    BinarySearchTree(){
        root =null;
    }


    // Insert method O(LogN)
    //recursive code to insert values in binary search tree
    private BSTNode insert(BSTNode currentNode, int value){
        if(currentNode==null){
            BSTNode node = new BSTNode();
            node.value = value;
            System.out.println("Successfully inserted node value");
            return node;
        }
        else if(value <=currentNode.value){ //O(N/2)
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        }
        else{ //O(N/2)
            currentNode.right = insert(currentNode.right, value); 
            return currentNode;
        }
    }

    void insert(int value){
       root = insert(root, value);
    }
    
    //preOrder Taversal method

    public void preOrderTaversal(BSTNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value +" ");
        preOrderTaversal(node.left);
        preOrderTaversal(node.right);
    }
    
    //in-Order Traversal method
    public void inorderTraversal(BSTNode node){
        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.value+ " ");
        inorderTraversal(node.right);
    }

    //post-Order Traversal
    public void postOrderTaversal(BSTNode node){
        if(node==null){
            return;
        }
        postOrderTaversal(node.left);
        postOrderTaversal(node.right);
        System.out.print(node.value+" ");
    }
}
