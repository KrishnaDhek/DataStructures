package LeetCodeSolutions;

public class ClimbingStair {
    public static int countDistinctWays(int n){
        int a =1, b =2, c =0;
        int i =3;
        while(i<=n){
            c = a+b;
            a = b;
            b = c;
            i++;
            
        }
        return c;

    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(countDistinctWays(n));
    }
    
}
