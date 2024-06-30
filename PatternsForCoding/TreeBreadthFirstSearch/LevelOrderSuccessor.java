package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.Queue;
import java.util.LinkedList;

class TreeNode_1 {
    int val;
    TreeNode_1 left;
    TreeNode_1 right;

    TreeNode_1(){}
    TreeNode_1(int val){
        this.val = val;
    }
    TreeNode_1(int val, TreeNode_1 left, TreeNode_1 right){
        this.val = val;
        this.left = left;
         this.right = right;
    }
}
public class LevelOrderSuccessor {
    public static TreeNode_1 levelSuccessor(TreeNode_1 root, int key){
        if(root ==null)
            return null;

        Queue<TreeNode_1> q = new  LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode_1 cNnode = q.poll();
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
        TreeNode_1 result  = levelSuccessor(root, 3);

        if(result!=null){
            System.out.println(result.val+" ");
        }
        else{
            System.out.println("No successor found");
        }
}
    
}
