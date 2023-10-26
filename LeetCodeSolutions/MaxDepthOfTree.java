package LeetCodeSolutions;
class TreeChild{
    int data;
    TreeChild left;
    TreeChild right;

    TreeChild(){}

    TreeChild(int data){
        this.data = data;
    }

    TreeChild(int data, TreeChild left, TreeChild right){
        this.data = data;
        this.left = left;
        this.right = right;

    }
}
public class MaxDepthOfTree {
    public static void main(String[] args) {
        TreeChild root =  new TreeChild(3);
        root.left = new TreeChild(9);
        root.right = new TreeChild(20);
        root.left.left = new TreeChild(11);
        root.left.right = new TreeChild(34);
        root.left.right.right =new TreeChild(44);
        root.right.left = new TreeChild(5);
        root.right.left.left = new TreeChild(56);
        root.right.left.left.left = new TreeChild(78);
        int depth = MaxDepthOfTree(root);
    }
    
}
