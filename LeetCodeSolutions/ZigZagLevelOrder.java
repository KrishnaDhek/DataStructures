package LeetCodeSolutions;
// 103. Binary Tree Zigzag Level Order Traversal
// Given the root of a binary tree, return the zigzag level order traversal of 
// its nodes' values. (i.e., from left to right, then right to left for the next level 
// and alternate between).

 
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.data = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.data =val;
        this.left = left;
        this.right = right;
    }
}

public class ZigZagLevelOrder {
    /**
     * @param root
     * @return
     */
    public static List<List<Integer>> zigZagOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean direction = true;
        while(!queue.isEmpty()){
            Deque<Integer> deque = new java.util.LinkedList<>();
            int level = queue.size();
            for(int i =0; i<level; i++){
                TreeNode cNode = queue.poll();
                if(direction){
                    deque.addLast(cNode.data);
                }
                else{
                    deque.addFirst(cNode.data);
                }

                if(cNode.left!=null){
                    queue.offer(cNode.left);
                }
                if(cNode.right!=null){
                    queue.offer(cNode.right);
                }
            }
            result.add(new ArrayList<>(deque));
            direction = !direction;
        }
        return result;



    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left =new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left=new TreeNode(5);
        root.left.right =new TreeNode(6);
        root.right.left =new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(10);
        List<List<Integer>> list = zigZagOrder(root);
        for(List<Integer> l : list)
        System.out.println(l);
    }
    
}
