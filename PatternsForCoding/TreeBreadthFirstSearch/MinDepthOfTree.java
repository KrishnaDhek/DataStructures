package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

class NodeTree{
    int data;
    NodeTree left;
    NodeTree right;
    NodeTree(){}
    NodeTree(int val){
        this.data = val;
    }
    NodeTree(int val, NodeTree left, NodeTree right){
        this.data =val;
        this.left = left;
        this.right = right;
    }
}
public class MinDepthOfTree {
    public static int minDepth(NodeTree root){
        if(root==null){
            return 0;
        }
        int depth =1;
        Queue<NodeTree> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i =0; i<level; i++){
                NodeTree cNode = q.poll();
                if(cNode.left==null && cNode.right==null){
                    return depth;
                }
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
        NodeTree root = new NodeTree(1);
        root.left = new NodeTree(2);
        root.right = new NodeTree(3);
        root.left.right = new NodeTree(4);
        root.right.left = new NodeTree(5);
        root.right.right = new NodeTree(6);
        root.right.left.left = new NodeTree(7);
        System.out.println(minDepth(root));
    }

}

