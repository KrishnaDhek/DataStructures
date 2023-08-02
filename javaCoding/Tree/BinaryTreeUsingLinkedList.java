package Tree;
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTreeUsingLinkedList {
    
    BinaryNode root;

    public BinaryTreeUsingLinkedList(){
        this.root =null;
    }

    //Preorder Traversal: Visit and print the Root node , then left sub tree and then right subtree
    
    //TC =>O(N)
    void PreOrderTraversal(BinaryNode node){
        //Check if the node is null
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        //recursively call the PreorderTraversal for left and right node respectively
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }
    //PostOrder Traversal: Visit and print Left subtree, then right subtree and then root node
    void PostOrderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.value+" ");
        
    }

    //Inorder Traversal :Visit and print left subtree, then root node and then right subtree
    void InorderTraversal(BinaryNode node){
        if(node==null){
            return;
        }
        InorderTraversal(node.left);
        System.out.print(node.value+" ");
        InorderTraversal(node.right);
    }

    //LevelOrder Traversal
    void LevelOrderTraversal(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value+" ");
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.add(currentNode.right);
            }
        }
    }

    //search method
    
    public void Search(String value){
        //perform level order traversal to find the given value
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currNode = queue.remove();
            if(currNode.value == value){
                System.out.println("The value "+value+" is found in the Binary Tree!");
                return;
            }
            else{
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
        System.out.println("The value "+value+" is not found in the Binary Tree!");
    }

    //insertion method
    public void InsertionInBinaryTree(String value){
        BinaryNode node = new BinaryNode();
        node.value =value;

        if(root==null){
            root = node;
            System.out.println("Inserted a new root node");
            return;
        }
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currNode = queue.remove();
            if(currNode.left==null){
                currNode.left = node;
                System.out.println("Successfully Inserted");
                break;
            }
            else if(currNode.right==null){
                currNode.right =node;
                System.out.println("Successfully Inserted");
                break;
            }
            else{
                queue.add(currNode.left);
                queue.add(currNode.right);
            }
        }
    }
}
