package Tree;
import java.util.Queue;
import java.util.LinkedList;
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

    // level-Order Traversal
    public void levelOrderTraversal(BSTNode node){
       Queue<BSTNode> queue = new LinkedList<BSTNode>();
       queue.add(root);
       while(!queue.isEmpty()){
        BSTNode currNode = queue.remove();
        System.out.print(currNode.value+" ");
        if(currNode.left!=null){
            queue.add(currNode.left);
        }
        if(currNode.right!=null){
            queue.add(currNode.right);
        }
       
       }
    }

    // search method

    BSTNode search(BSTNode node, int value){
        //if the root is null
        if(node==null){
            System.out.println("Vaue "+value+" is not found in BST ");
            return null;
        }
        //if the value to be search is present int the root 
        else if(node.value ==value){
            System.out.println("Vaue "+value+" is found in BST");
            return node;
        }
        else if(value<=node.value){ 
            // recursive call to search value in the left subtree
            return search(node.left, value);
        }
        else{
            // recursive call to search value in the right subtree
            return search(node.right, value);
        }
    }

    // find Minimum node

    public BSTNode MinimumNode(BSTNode root){
        if(root.left==null){
            return root;
        }
        else{
            return MinimumNode(root.left);
        }
    }

    // delete node

    public BSTNode deleteNode(BSTNode root, int value){
        if(root==null){
            System.out.println("Value "+value+ " not found in BST");
            return null;
        }
        if(value<root.value){
            root.left = deleteNode(root.left, value);
        }else if(value>root.value){
            root.right = deleteNode(root.right, value);
        }
        else{
            if(root.left !=null && root.right!=null){
                BSTNode temp = root;
                BSTNode minForRight = MinimumNode(temp.right);
                root.value = minForRight.value;
                root.right = deleteNode(root.right, minForRight.value);
            }
            else if(root.left!=null){
                root = root.left;
            }
            else if(root.right!=null){
                root = root.right;
            }
            else{
                root = null;
            }
        }
        return root;
    }
}
