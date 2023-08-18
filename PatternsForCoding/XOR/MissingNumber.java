
    package PatternsForCoding.XOR;

public class MissingNumber {
    public static int MissingNumber(int[] num){
        int ans =0;
        for(int i: num){
            ans^=i;
        }
        for(int i=0; i<=num.length; i++){
            ans^=i;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] num ={0,1,3,4,5,6,7};
        System.out.println(MissingNumber(num));
    }
    
}


