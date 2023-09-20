package PatternsForCoding.TreeDepthFirstSearch;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.data = val;

    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.data = val;
        this.left = left;
        this.right =right;

    }
}

public class PathWithGivenSequence {
    public static boolean hasPath(TreeNode root, int[] sequence) {
        if (root == null) return sequence.length == 0;
        return checkPath(root, sequence, 0);
    }

    private static boolean checkPath(TreeNode currentNode, int[] sequence, int index) {
        if (currentNode == null || index >= sequence.length || currentNode.data != sequence[index])
            return false;

        // If the current node is a leaf and matches the end of the sequence, return true
        if (currentNode.left == null && currentNode.right == null && index == sequence.length - 1)
            return true;

        // Otherwise, check the left and right subtrees
        return checkPath(currentNode.left, sequence, index + 1) || checkPath(currentNode.right, sequence, index + 1);
    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(0);
        
        System.out.println(hasPath(root, new int[] {1, 1, 6}));  // true
        System.out.println(hasPath(root, new int[] {1, 0, 7}));  // false
        System.out.println(hasPath(root, new int[] {1, 1, 6, 8}));  // false
    }
}
