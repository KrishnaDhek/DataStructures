package LeetCodeSolutions;

import java.math.BigInteger;

public class AddBinaryString {

    public static String addBinary(String a, String b){
        BigInteger i =new BigInteger(a,2);
        BigInteger j = new BigInteger(b,2);
        BigInteger zero = BigInteger.ZERO;
        

        while(j!=zero){
            BigInteger sum = i.xor(j);
            BigInteger carry = i.and(j).shiftLeft(1);

            i =sum;
            j =carry;
        }
        return i.toString(2);

    }
    public static void main(String[] args) {
        String a ="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b ="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String result = addBinary(a, b);
        System.out.println(result);

    }
    
}
