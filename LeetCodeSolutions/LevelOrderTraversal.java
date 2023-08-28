package LeetCodeSolutions;
// 102. Binary Tree Level Order Traversal
// Given the root of a binary tree, return the level order traversal of its nodes' values. 
// (i.e., from left to right, level by level).
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class treeNode{
    int data;
    treeNode left;
    treeNode right;
    treeNode(){}
    treeNode(int val){
        this.data = val;
    }
    treeNode(int val, treeNode left, treeNode right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(treeNode  root){
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<treeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level =queue.size();
            List<Integer> result = new ArrayList<>();
            for(int i =0; i<level; i++){
                treeNode cNode = queue.remove();
                result.add(cNode.data);
                if(cNode.left!=null){
                    queue.add(cNode.left);
                }
                if(cNode.right!=null){
                    queue.add(cNode.right);
                }

            }
            list.add(result);
            
        }
        return list;
    }
    public static void main(String[] args) {
        treeNode root = new treeNode(3);
        root.left =new treeNode(2);
        root.right = new treeNode(4);
        root.left.left=new treeNode(5);
        root.left.right =new treeNode(6);
        root.right.left =new treeNode(7);
        root.right.right = new treeNode(8);
        root.right.left.left = new treeNode(9);
        root.right.left.right = new treeNode(10);
        List<List<Integer>> list =levelOrder(root);
        for(List<Integer> l: list)
        System.out.println(l);
    }
    
}
