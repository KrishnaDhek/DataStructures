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
            return dfs(root,0);
    }
    private static int dfs(TreeNode root, int sum){
        if(root ==null)
            return 0;

            sum = sum*10+root.data;

            if(root.left== null && root.right==null)
                return sum;

            return dfs(root.left, sum)+dfs(root.right, sum);
    }
    public static void main(String[] args) {
        TreeNode leftChild = new TreeNode(1);
        TreeNode rightChild = new TreeNode(2);
        TreeNode root = new TreeNode(0,leftChild, rightChild);
        System.out.println(sumNum(root));
    }
    
}
