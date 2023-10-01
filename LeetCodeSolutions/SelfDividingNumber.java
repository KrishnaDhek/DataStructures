package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

    public static List<Integer> selfDividingNumber(int left, int right){

        List<Integer> list = new ArrayList<>();

        for(int i= left; i<=right; i++){
            if(divisible(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean divisible(int i){
        int temp = i;

        while(temp>0){
            int ans = temp%10;

            if(ans==0 || i%ans !=0){
                return false;
            }

            temp = temp/10;
        }

        return true;
    }
    public static void main(String[] args) {
        int left =18;
        int right =88;
         List<Integer> list = selfDividingNumber(left,right);
         System.out.println(list);
    }
    
}
