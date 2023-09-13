package LeetCodeSolutions;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s){

        char[] ch = s.toCharArray();
        int i=0;
        int j= s.length()-1;

        while(i<j){
            while(i<j && !Character.isLetter(ch[i])){
                i++;
            }
            while(i<j && !Character.isLetter(ch[j])){
                j--;
            }

            char temp =ch[i];
            ch[i] = ch[j];
            ch[j] =temp;
            i++;
            j--;
        }
        return new String(ch);

    }
    public static void main(String[] args) {
        String s = "a-bC-dEF-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    
}
