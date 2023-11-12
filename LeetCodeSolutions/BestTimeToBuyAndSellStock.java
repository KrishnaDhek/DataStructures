package LeetCodeSolutions;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
       int buy = Integer.MAX_VALUE;
       int sell =0;

       for(int price : prices){
        if(price<buy){
            buy = price;
        }
        else{
            sell = Math.max(sell, price-buy);
        }
       } return sell;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The maximum profir is :"+maxProfit(prices));
    }
    
}
