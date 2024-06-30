package PatternsForCoding.TreeDepthFirstSearch;


class TreeNode_5 {
    int val;
    TreeNode_4 left;
    TreeNode_4 right;
    TreeNode_5(){}
    TreeNode_5(int val){
        this.val =val;
    }
    TreeNode_5(int val, TreeNode_4 left, TreeNode_4 right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class TreeDiameter {
    private static int dia = 0;
    public static int depthOfTree(TreeNode_4 root){
        depth(root);
        return dia;
    }

    private static int depth(TreeNode_4 root){
        if(root==null)
            return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        dia =Math.max(dia, leftDepth+rightDepth);

        return Math.max(leftDepth, rightDepth)+1;
    }
    public static void main(String[] args) {
        TreeNode_4 root = new TreeNode_4(1);
        root.left = new TreeNode_4(2);
        root.left.left = new TreeNode_4(3);
        root.left.right = new TreeNode_4(4);
        root.right = new TreeNode_4(5);
        root.right.left = new TreeNode_4(6);
        root.right.right = new TreeNode_4(8);
        System.out.println(depthOfTree(root));
    }
    
}
