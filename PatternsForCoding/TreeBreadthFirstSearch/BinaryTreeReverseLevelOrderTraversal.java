package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class BinaryTreeReverseLevelOrderTraversal {

    public static List<List<Integer>> ReverseLevelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            
            // Add each level to the beginning of the result list
            result.add(0, currentLevel);
        }

        return result;
    }

    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> list = ReverseLevelOrderTraversal(root);
        for(List<Integer> l : list)
        System.out.println(l);

    }
    
}
