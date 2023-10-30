package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class tNode{
    int data ;
    tNode left;
    tNode right;
    tNode(){}
    tNode(int val){
        this.data= val;
    }
    tNode(int val, tNode left, tNode right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}
public class TreeLeftView {
    public static List<Integer> leftView(tNode root){
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<tNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i =0; i<level; i++){
                tNode cNode = q.poll();
                if(i==0){
                    list.add(cNode.data);
                }
                if(cNode.left!=null)
                q.add(cNode.left);

                if(cNode.right!=null)
                q.add(cNode.right);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        tNode root = new tNode(1);
        root.left = new tNode(2);
        root.right = new tNode(3);
        root.left.right = new tNode(4);
        root.right.left = new tNode(5);
        root.left.left= new tNode(6);
        root.left.right.right = new tNode(7);
        root.right.left.right = new tNode(8);
        List<Integer> list = leftView(root);
        System.out.println(list);
    }
    
}
