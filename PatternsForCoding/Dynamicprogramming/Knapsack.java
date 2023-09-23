package PatternsForCoding.Dynamicprogramming;

public class Knapsack {
    public static int knapSack(int[] val, int[] weight, int total){
        int[][] dp = new int[val.length+1][total+1];

        for(int i=1; i<=val.length; i++){
            for(int j=0; j<=total; j++){
                if(i==0 ||j==0){
                    dp[i][j] = 0;

                }
                else if(weight[i-1]<=j){
                    dp[i][j] =Math.max(val[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[val.length][total];

    }
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] weight ={ 10, 20, 30 };
        int total = 50;
        System.out.println(knapSack(val, weight, total));
    }
}
