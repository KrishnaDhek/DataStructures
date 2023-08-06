// Leetcode 28.
// Given two strings needle and haystack, return the index of the first 
// occurrence of needle in haystack, or -1 if needle is not part of haystack.
package LeetCodeSolutions;

public class FindTheIndexOfFirstOccurrenceString {
    public static int FirstIndex(String hayStack, String needle){
        // int count =0;
        // int hayStackLen = hayStack.length();
        // int needleLen = needle.length();

        // if(hayStackLen<needleLen)
        //     return -1;

        // for(int i=0; i<hayStackLen; i++){
        //     if(hayStack.charAt(i)==needle.charAt(count)){
        //         count++;
        //     }
        //     else if(hayStack.charAt(i)!=needle.charAt(count)){
        //         i = i-count;
        //         count =0;
        //     }
        //     if(count==needleLen){
        //         return i -=count-1;
        //     }
        // }
        // return -1;


            if(hayStack.contains(needle)){
                return hayStack.indexOf(needle);

            }
             return -1;  
            

    }

    public static void main(String[] args) {
        String hayStack = "leetcode";
        String needle = "code";
       int ans = FirstIndex(hayStack,needle);
        System.out.println(ans);
    }
    
}
