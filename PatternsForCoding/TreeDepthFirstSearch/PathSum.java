package PatternsForCoding.TreeDepthFirstSearch;

import java.util.List;

import java.util.ArrayList;

class NodeOfTree{
    int data;
    NodeOfTree left;
    NodeOfTree right;
    NodeOfTree(){}
    NodeOfTree(int val){
        this.data = val;
    }
    NodeOfTree(int val, NodeOfTree left, NodeOfTree right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
public class PathSum {
    private static List<NodeOfTree> pathList = new ArrayList<>();
    public static boolean hasPathSum(NodeOfTree root, int target){
        if(root==null)
            return false;

            pathList.add(root);
        target -=root.data;

        if(root.left==null && root.right==null && target==0){
            PrintThePath();
            return true;
            
        }
        if(hasPathSum(root.left, target) || hasPathSum(root.right, target)){
            return true;
        }
        
        pathList.remove(pathList.size()-1);
        return false;
    }

    private static void PrintThePath(){
        int size = pathList.size();
        for(int i=0; i<size; i++){
            System.out.print(pathList.get(i).data);
            if(i<size-1){
                System.out.print("->");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NodeOfTree root = new NodeOfTree(5);
        root.left = new NodeOfTree(4);
        root.left.left = new NodeOfTree(11);
        root.left.left.left = new NodeOfTree(7);
        root.left.left.right = new NodeOfTree(2);
        root.right = new NodeOfTree(8);
        root.right.left = new NodeOfTree(13);
        root.right.right = new NodeOfTree(4);
        root.right.right.right =new NodeOfTree(1);
        root.right = new NodeOfTree(8);
        int target = 26;
        System.out.println("Does tree has a path that is equal to the given sum from root-to-leaf ? " +hasPathSum(root, target ));
    }
    
}
