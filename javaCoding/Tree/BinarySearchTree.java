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
    
   
}
