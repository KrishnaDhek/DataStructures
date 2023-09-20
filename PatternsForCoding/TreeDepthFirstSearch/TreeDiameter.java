package PatternsForCoding.TreeDepthFirstSearch;


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
    private static int dia = 0;
    public static int depthOfTree(TreeNode root){
        depth(root);
        return dia;
    }

    private static int depth(TreeNode root){
        if(root==null)
            return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        dia =Math.max(dia, leftDepth+rightDepth);

        return Math.max(leftDepth, rightDepth)+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(depthOfTree(root));
    }
    
}
