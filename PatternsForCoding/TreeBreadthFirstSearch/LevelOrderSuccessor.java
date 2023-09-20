package PatternsForCoding.TreeBreadthFirstSearch;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
         this.right = right;
    }
}
public class LevelOrderSuccessor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.left.left= new TreeNode(7);
        root.left.left.right =new TreeNode(8);
        root.right.left.right = new TreeNode(10);
        System.out.println(levelSuccessor(root));
}
    
}
