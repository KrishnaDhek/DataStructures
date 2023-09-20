package PatternsForCoding.TreeDepthFirstSearch;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        data = val;
    }
    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class SumRootToLeaf {
    public static int sumNum(TreeNode root){
        
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(2);
        TreeNode root = new TreeNode(0,leftChild, rightChild);
        System.out.println(sumNum(root));
    }
    
}
