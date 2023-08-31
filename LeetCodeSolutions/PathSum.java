package LeetCodeSolutions;
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
public class PathSum {
    public static boolean hasPathSum(NodeOfTree root, int sum){
        if(root==null)
            return false;

            sum -= root.data;
            if(root.left==null && root.right==null&& sum==0){
                return true;
            }
            if(hasPathSum(root.left, sum) || hasPathSum(root.right, sum)){
                return true;
            }
            return false;

    }
    public static void main(String[] args) {
        NodeOfTree root = new NodeOfTree(5);
        root.left = new NodeOfTree(4);
        root.left.left = new NodeOfTree(11);
        root.left.left.left = new NodeOfTree(7);
        root.left.left.right = new NodeOfTree(2);
        root.right = new NodeOfTree(8);
        root.right.left = new NodeOfTree(13);
        root.right.right = new NodeOfTree(4);
        root.right.right.right =new NodeOfTree(1);
        int target = 21;
        System.out.println();
        System.out.println("Does tree has a path that is equal to the given sum from root-to-leaf ? " +hasPathSum(root, target ));
        System.out.println();
    }
    
}
