package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.Queue;
import java.util.LinkedList;

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
         this.right = right;
    }
}
public class LevelOrderSuccessor {
    public static TreeNode levelSuccessor(TreeNode root, int key){
        if(root ==null)
            return null;

        Queue<TreeNode> q = new  LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cNnode = q.poll();
            if(cNnode.left!=null)
                q.offer(cNnode.left);
            if(cNnode.right!=null)
                q.offer(cNnode.right);

            if(cNnode.val == key)
                    break;

        }
        return q.peek();

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.left.left= new TreeNode(7);
        root.left.left.right =new TreeNode(8);
        root.right.left.right = new TreeNode(10);
        TreeNode result  = levelSuccessor(root, 3);

        if(result!=null){
            System.out.println(result.val+" ");
        }
        else{
            System.out.println("No successor found");
        }
}
    
}
