package LeetCodeSolutions;

public class LengthOfLastWord {
    public static int lengOfLastWord(String s){
        s =s.trim();
        int count =0;
        int j = s.length()-1;
        while(j>=0 && s.charAt(j)!=' '){
            count++;
            j--;
        }
        return count;

    }
    public static void main(String[] args) {
        String s = " fly to the moon ";
        System.out.println(lengOfLastWord(s));
    }
    
}
