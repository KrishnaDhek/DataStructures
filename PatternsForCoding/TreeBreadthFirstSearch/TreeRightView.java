package PatternsForCoding.TreeBreadthFirstSearch;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TNode{
    int data;
    TNode left;
   TNode right;
   TNode(){}
    TNode(int val){
        this.data =val;

    }
   TNode(int val, TNode left, TNode right){
        this.data = val;
        this.left= left;
        this.right = right;
    }
}
public class TreeRightView {
    public static List<Integer> rightView(TNode root){
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return  list;
        }
        Queue<TNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int level = q.size();
            for (int i=0; i<level; i++){
                TNode cNode = q.poll();
                if(i==level-1){
                    list.add(cNode.data);
                }
                if(cNode.left!=null)
                    q.add(cNode.left);
                if(cNode.right!=null)
                    q.add(cNode.right);
            }


        }return list;

    }

    public static void main(String[] args) {
        TNode treeNode = new TNode(1);
        treeNode.left = new TNode(2);
        treeNode.left.right = new TNode(5);
        treeNode.right = new TNode(3);
        treeNode.right.right =new TNode(4);
        treeNode.left.right.left = new TNode(6);
        List<Integer> list = rightView(treeNode);
        for(int i: list)
            System.out.println(i);
    }
}
