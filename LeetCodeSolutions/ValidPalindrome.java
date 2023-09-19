package LeetCodeSolutions;

public class ValidPalindrome {
    public static boolean validPaln(String s){
        s = s.toLowerCase();
        String str = s.replaceAll("[^a-zA-Z0-9]","");

        int i =0; 
        int j =str.length()-1;

        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--))
            return false;

        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is string a valid palindrome :"+validPaln(s));
    }

    
    
}
