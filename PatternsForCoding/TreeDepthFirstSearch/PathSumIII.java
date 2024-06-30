package PatternsForCoding.TreeDepthFirstSearch;

import java.util.HashMap;

class NodeOfTree{
    int data;
    NodeOfTree_1 left;
    NodeOfTree_1 right;
    NodeOfTree(){}
    NodeOfTree(int val){
        this.data = val;
    }
    NodeOfTree(int val, NodeOfTree_1 left, NodeOfTree_1 right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

public class PathSumIII {
    public static int pathSum(NodeOfTree_1 root, int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0, 1);
        return dfs(root, 0, target, map);

    }

    public static int dfs(NodeOfTree_1 root, int currSum, int target, HashMap<Integer,Integer> map){
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
        NodeOfTree_1 root = new NodeOfTree_1(10);
        root.left = new NodeOfTree_1(5);
        root.left.left= new NodeOfTree_1(3);
        root.left.right = new NodeOfTree_1(2);
        root.left.left.left = new NodeOfTree_1(3);
        root.left.left.right = new NodeOfTree_1(-2);
        root.left.right.right = new NodeOfTree_1(1);
        root.right = new NodeOfTree_1(-3);
        root.right.right = new NodeOfTree_1(11);
        int target = 8;
        System.out.println(pathSum(root, 8));
    }
    
}
