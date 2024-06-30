package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

class TreeNode_2 {
    int val;
    TreeNode_1 left;
     TreeNode_1 right;
      TreeNode_2() {}
      TreeNode_2(int val) { this.val = val; }
      TreeNode_2(int val, TreeNode_1 left, TreeNode_1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class BinaryTreeReverseLevelOrderTraversal {

    public static List<List<Integer>> ReverseLevelOrderTraversal(TreeNode_1 root){
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode_1> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode_1 currentNode = queue.poll();
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
        TreeNode_1 root = new TreeNode_1(3, new TreeNode_1(9), new TreeNode_1(20, new TreeNode_1(15), new TreeNode_1(7)));

        List<List<Integer>> list = ReverseLevelOrderTraversal(root);
        for(List<Integer> l : list)
        System.out.println(l);

    }
    
}
