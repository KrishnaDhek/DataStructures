package PatternsForCoding.TreeDepthFirstSearch;
class TreeNode_4 {
    int data;
    TreeNode_4 left;
    TreeNode_4 right;

    TreeNode_4(){}
    TreeNode_4(int val){
        data = val;
    }
    TreeNode_4(int data, TreeNode_4 left, TreeNode_4 right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class SumRootToLeaf {
    public static int sumNum(TreeNode_4 root){
            return dfs(root,0);
    }
    private static int dfs(TreeNode_4 root, int sum){
        if(root ==null)
            return 0;

            sum = sum*10+root.data;

            if(root.left== null && root.right==null)
                return sum;

            return dfs(root.left, sum)+dfs(root.right, sum);
    }
    public static void main(String[] args) {
        TreeNode_4 leftChild = new TreeNode_4(1);
        TreeNode_4 rightChild = new TreeNode_4(2);
        TreeNode_4 root = new TreeNode_4(0,leftChild, rightChild);
        System.out.println(sumNum(root));
    }
    
}
