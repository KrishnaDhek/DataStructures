package PatternsForCoding.TreeDepthFirstSearch;

import java.util.HashMap;

class NodeOfTree{
    int data;
    NodeOfTree left;
    NodeOfTree right;
    NodeOfTree(){}
    NodeOfTree(int val){
        this.data = val;
    }
    NodeOfTree(int val, NodeOfTree left, NodeOfTree right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

public class PathSumIII {
    public static int pathSum(NodeOfTree root, int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0, 1);
        return dfs(root, 0, target, map);

    }

    public static int dfs(NodeOfTree root, int currSum, int target, HashMap<Integer,Integer> map){
        if (root == null) {
            return 0;
        }

        currSum += root.data;
        int res = map.getOrDefault(currSum - target, 0);
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        res += dfs(root.left, currSum, target, map) + dfs(root.right, currSum, target, map);
        map.put(currSum, map.get(currSum) - 1);  // Backtrack
        return res;
    }
    
    public static void main(String[] args) {
        NodeOfTree root = new NodeOfTree(10);
        root.left = new NodeOfTree(5);
        root.left.left= new NodeOfTree(3);
        root.left.right = new NodeOfTree(2);
        root.left.left.left = new NodeOfTree(3);
        root.left.left.right = new NodeOfTree(-2);
        root.left.right.right = new NodeOfTree(1);
        root.right = new NodeOfTree(-3);
        root.right.right = new NodeOfTree(11);
        int target = 8;
        System.out.println(pathSum(root, 8));
    }
    
}
