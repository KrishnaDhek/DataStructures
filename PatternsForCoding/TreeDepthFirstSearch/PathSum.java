package PatternsForCoding.TreeDepthFirstSearch;

import java.util.List;

import java.util.ArrayList;

class NodeOfTree_1 {
    int data;
    NodeOfTree_1 left;
    NodeOfTree_1 right;
    NodeOfTree_1(){}
    NodeOfTree_1(int val){
        this.data = val;
    }
    NodeOfTree_1(int val, NodeOfTree_1 left, NodeOfTree_1 right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
public class PathSum {
    private static List<NodeOfTree_1> pathList = new ArrayList<>();
    public static boolean hasPathSum(NodeOfTree_1 root, int target){
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
        NodeOfTree_1 root = new NodeOfTree_1(5);
        root.left = new NodeOfTree_1(4);
        root.left.left = new NodeOfTree_1(11);
        root.left.left.left = new NodeOfTree_1(7);
        root.left.left.right = new NodeOfTree_1(2);
        root.right = new NodeOfTree_1(8);
        root.right.left = new NodeOfTree_1(13);
        root.right.right = new NodeOfTree_1(4);
        root.right.right.right =new NodeOfTree_1(1);
        root.right.right.left = new NodeOfTree_1(8);
        root.right.right.left.right = new NodeOfTree_1(8);
        int target = 26;
        System.out.println("Does tree has a path that is equal to the given sum from root-to-leaf ? " +hasPathSum(root, target ));
    }
    
}
