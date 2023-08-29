package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

class BNode{
    int data;
    BNode left;
    BNode right;
    BNode(){}
    BNode(int val){
        this.data = val;
    }
    BNode(int val, BNode left, BNode right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
public class MaximumDepthOfBinaryTree {
    public static int maxDepth(BNode root){
        if(root==null){
            return 0;
        }

        int depth =0;
        Queue<BNode> q = new LinkedList<>();
        q.offer(root);


        while(!q.isEmpty()){
            int level = q.size();
            for(int i =0; i<level; i++){
                BNode cNode =   q.poll();

                if(cNode.left!=null)
                q.add(cNode.left);

                if(cNode.right!=null)
                q.add(cNode.right);
            }
            depth++;
        }
        return depth;
    }
    public static void main(String[] args) {
        BNode root = new BNode(1);
        root.left = new BNode(2);
        root.right = new BNode(3);
        root.left.right = new BNode(4);
        root.right.left = new BNode(5);
        root.right.right = new BNode(6);
        root.right.left.left = new BNode(7);
        System.out.println(maxDepth(root));
    }
    
}
