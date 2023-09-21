package PatternsForCoding.TreeDepthFirstSearch;

import java.util.Stack;

class TN{
    int value;
    TN left;
    TN right;

    TN(){}
    TN(int value){
        this.value = value;
    }
    TN(int value, TN left, TN right){
        this.value =  value;
        this.left = left;
         this.right = right;
    }
}
public class KthSmallestElementinaBST {
    public static int kthSmallestEle(TN root, int k){
        Stack<TN> stack = new Stack<>();

        while(root!=null || !stack.isEmpty()){

            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            k--;

            if(k==0){
                return root.value;
            }

            root = root.right;
        }

        return -1;
    }
    public static void main(String[] args) {
        TN root =new TN(5);
        root.left =new TN(2);
        root.left.right =new TN(3);
        root.right =new TN(8);
        root.right.left = new TN(6);
        System.out.println(kthSmallestEle(root, 4));
        
    }
    
}
