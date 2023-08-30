package PatternsForCoding.TreeBreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

class Pointer{
    int data;
    Pointer left;
    Pointer right;
    Pointer next;
    Pointer(){}
    Pointer(int val){
        data = val;
    }
    Pointer(int val, Pointer l, Pointer r, Pointer n){
       data = val;
        left = l;
        right = r;
        next = n;
    }
}
public class PopulatingNextRightPointerInEachNode {
    public static Pointer connectPointer(Pointer root){
        if(root==null){
            return null;
        }

        Pointer level =root;

        while(level!=null){
            Pointer  cNode = level;

            while(cNode!=null){
                cNode.left.next =cNode.right;

                if(cNode.next!=null){
                    cNode.right.next = cNode.next.left;
                }
                cNode = cNode.next;
            }
            level = level.next;
        }
        return root;

    }
    public static String print(Pointer root) {
    if (root == null) {
        return "";
    }

    StringBuilder result = new StringBuilder();
    Queue<Pointer> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();

        for (int i = 0; i < levelSize; i++) {
            Pointer currentNode = queue.poll();

            result.append(currentNode.data);
            result.append(",");

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        result.append("#,");
    }

    // Remove trailing comma
    result.setLength(result.length() - 1);

    return result.toString();
}
    public static void main(String[] args) {
        Pointer root = new Pointer(1);
        root.left = new Pointer(2);
        root.right = new Pointer(3);
        root.left.left = new Pointer(4);
        root.left.right = new Pointer(5);
        root.right.left = new Pointer(6);
        root.right.right = new Pointer(7);
        connectPointer(root);
        System.out.println(print(root));;

        
    }
    
}
