package PatternsForCoding.TreeDepthFirstSearch;
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
        this.right =right;

    }
}

public class PathWithGivenSequence {
    public boolean hasPath(TreeNode root, int[] sequence) {
        if (root == null) return sequence.length == 0;
        return checkPath(root, sequence, 0);
    }

    private boolean checkPath(TreeNode currentNode, int[] sequence, int index) {
        if (currentNode == null || index >= sequence.length || currentNode.val != sequence[index])
            return false;

        // If the current node is a leaf and matches the end of the sequence, return true
        if (currentNode.left == null && currentNode.right == null && index == sequence.length - 1)
            return true;

        // Otherwise, check the left and right subtrees
        return checkPath(currentNode.left, sequence, index + 1) || checkPath(currentNode.right, sequence, index + 1);
    }
    
}
