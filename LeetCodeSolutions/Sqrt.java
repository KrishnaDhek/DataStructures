package LeetCodeSolutions;

public class Sqrt {
    public static int numSqrt(int x){
        int left =1;
        int right =x;

        while(left<=right){
            int mid = left+(right-left);

            if((long)mid*mid ==x){
                return mid;
            }
            if((long)mid*mid<x){

                left =mid+1;

            } else {
                right = mid-1;
            }
        }
        return right;

    }
    public static void main(String[] args) {
        int n = 2456889;
        System.out.println(numSqrt(n));
    }
    
}
