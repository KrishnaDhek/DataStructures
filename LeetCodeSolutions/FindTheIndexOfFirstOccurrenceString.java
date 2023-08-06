package LeetCodeSolutions;

public class FindTheIndexOfFirstOccurrenceString {
    public static int FirstIndex(String hayStack, String needle){
        int count =0;
        int hayStackLen = hayStack.length();
        int needleLen = needle.length();

        if(hayStackLen<needleLen)
            return -1;

        for(int i=0; i<hayStackLen; i++){
            if(hayStack.charAt(i)==needle.charAt(count)){
                count++;
            }
            else if(hayStack.charAt(i)!=needle.charAt(count)){
                i = i-count;
                count =0;
            }
            if(count==needleLen){
                return i -=count-1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String hayStack = "leeetcode";
        String needle = "codeleet";
       int ans = FirstIndex(hayStack,needle);
        System.out.println(ans);
    }
    
}
