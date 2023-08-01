package Tree;

public class Main {
    public static void main(String[] args) {
    
    TreeNode drinks = new TreeNode("Drinks");
    TreeNode hot = new TreeNode("Hot");
    TreeNode cold = new TreeNode("Cold");
    TreeNode tea = new TreeNode("Tea");
    TreeNode coffee = new TreeNode("Coffee");
    TreeNode coke = new TreeNode("Coke");
    TreeNode soda = new TreeNode("Soda");
    drinks.addChildren(hot);
    drinks.addChildren(cold);
    hot.addChildren(tea);
    hot.addChildren(coffee);
    cold.addChildren(coke);
    cold.addChildren(soda);
    System.out.println(drinks.print(0));
        
    }
    
    
}
