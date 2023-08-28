package PatternsForCoding.TreeBreadthFirstSearch;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ZigZagTraversal{
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean lefttoright = true; // true means left to right, false means right to left

        while (!queue.isEmpty()) {
            Deque<Integer> deque = new LinkedList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();
                if (lefttoright) {
                    deque.addLast(currentNode.val); // Add to the end for left to right
                } else {
                    deque.addFirst(currentNode.val); // Add to the front for right to left
                }

                if (currentNode.left != null) queue.offer(currentNode.left);
                if (currentNode.right != null) queue.offer(currentNode.right);
            }

            result.add(new ArrayList<>(deque));
            lefttoright = !lefttoright; // Switch the direction for the next level
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);        
        List<List<Integer>> result = zigzagLevelOrder(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}


    

