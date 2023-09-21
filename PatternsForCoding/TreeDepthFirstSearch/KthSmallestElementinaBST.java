package PatternsForCoding.TreeDepthFirstSearch;
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int value){
        this.value = value;
    }
    TreeNode(int value, TreeNode left, TreeNode right){
        this.value =  value;
        this.left = left;
         this.right = right;
    }
}
public class KthSmallestElementinaBST {
    public static int kthSmallestEle(TreeNode root, int k){
        
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(5);
        root.left =new TreeNode(2);
        root.left.right =new TreeNode(3);
        root.right =new TreeNode(8);
        root.right.left = new TreeNode(6);
        System.out.println(kthSmallestEle(root, 4));
        
    }
    
}
