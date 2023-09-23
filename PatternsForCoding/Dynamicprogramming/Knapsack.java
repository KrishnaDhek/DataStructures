package PatternsForCoding.Dynamicprogramming;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] weight ={ 10, 20, 30 };
        int total = 50;
        System.out.println(knapSack(val, weight, total));
    }
}
