package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class BinaryTreeLevelOrder {
    public static List<List<Integer>> BinaryTreeLevelOrder(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
        List<Integer> level = new ArrayList<>();
        int l = queue.size();
        for(int i =0; i<l; i++){
            TreeNode cNode = queue.remove();
            level.add(cNode.val);
            if(cNode.left!=null){
                queue.add(cNode.left);
            }
            if(cNode.right!=null){
                queue.add(cNode.right);
            }

        }
        list.add( level);
       }
       return list;
    }

    public static void main(String[] args) {
    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> list = BinaryTreeLevelOrder(root);

        for(List<Integer> l : list)
        System.out.println(l);
    }
    
}
