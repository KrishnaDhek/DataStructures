package LeetCodeSolutions;

public class PalindromeNumber {
    public static boolean palinNum(int x){
        if(x<0)
            return false;
            int n = x;
            int result , ans =0;

        while(x>0){
            result = x%10;
            ans = ans*10+result;
            x = x/10;
        }

        if(ans==n){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int n = 1456541;
        System.out.println(palinNum(n));
    }
    
}
