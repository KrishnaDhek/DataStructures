package PatternsForCoding.TreeBreadthFirstSearch;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class node{
    int data;
    node left;
   node right;
   node(){}
    node(int val){
        this.data =val;

    }
   node(int val, node left, node right){
        this.data = val;
        this.left= left;
        this.right = right;
    }
}
public class RightViewOfTree  {
    public static List<Integer> rightView(node root){
        List<Integer> list = new ArrayList<>();
        if (root==null){
            return  list;
        }
        Queue<node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            int level = q.size();
            for (int i=0; i<level; i++){
                node cNode = q.poll();
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
        node treeNode = new node(1);
        treeNode.left = new node(2);
        treeNode.left.right = new node(5);
        treeNode.right = new node(3);
        treeNode.right.right =new node(4);
        treeNode.left.right.left = new node(6);
        List<Integer> list = rightView(treeNode);
        System.out.println(list);;
    }
}
