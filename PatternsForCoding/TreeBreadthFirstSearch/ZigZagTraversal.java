package PatternsForCoding.TreeBreadthFirstSearch;
import java.util.*;

class TreeNode {
    int val;
    TreeNode_1 left;
    TreeNode_1 right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode_1 left, TreeNode_1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ZigZagTraversal{
    public static List<List<Integer>> zigzagLevelOrder(TreeNode_1 root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode_1> queue = new LinkedList<>();
        queue.offer(root);
        boolean lefttoright = true; // true means left to right, false means right to left

        while (!queue.isEmpty()) {
            Deque<Integer> deque = new LinkedList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode_1 currentNode = queue.remove();
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
        TreeNode_1 root = new TreeNode_1(1);
        root.left = new TreeNode_1(2);
        root.right = new TreeNode_1(3);
        root.left.left = new TreeNode_1(4);
        root.left.right = new TreeNode_1(5);
        root.right.left = new TreeNode_1(6);
        root.right.right = new TreeNode_1(9);
        root.left.left.left= new TreeNode_1(7);
        root.left.left.right =new TreeNode_1(8);
        root.right.left.right = new TreeNode_1(10);

        List<List<Integer>> list = zigzagLevelOrder(root);
        System.out.println(list);

    
    }
}


    

