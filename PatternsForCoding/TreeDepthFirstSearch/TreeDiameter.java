package PatternsForCoding.TreeDepthFirstSearch;

import apple.laf.JRSUIUtils.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val =val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class TreeDiameter {
    public static int depthOfTree(TreeNode root){
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        System.out.println(depthOfTree(root));
    }
    
}
