package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode_3 {
    int val;
    TreeNode_1 left;
     TreeNode_1 right;
      TreeNode_3() {}
      TreeNode_3(int val) { this.val = val; }
      TreeNode_3(int val, TreeNode_1 left, TreeNode_1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class BinaryTreeLevelOrder {
    public static List<List<Integer>> BinaryTreeLevelOrder(TreeNode_1 root){
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
       Queue<TreeNode_1> queue = new LinkedList<>();
       queue.add(root);

       while(!queue.isEmpty()){
        List<Integer> level = new ArrayList<>();
        int l = queue.size();
        for(int i =0; i<l; i++){
            TreeNode_1 cNode = queue.remove();
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
    TreeNode_1 root = new TreeNode_1(3, new TreeNode_1(9), new TreeNode_1(20, new TreeNode_1(15), new TreeNode_1(7)));
        List<List<Integer>> list = BinaryTreeLevelOrder(root);

        for(List<Integer> l : list)
        System.out.println(l);
    }
    
}
