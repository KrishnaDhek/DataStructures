package LeetCodeSolutions;

public class ReverseString {
    public static void ReverseString(char[] arr){
        if(arr.length<1)
            return;

        int i =0;
        int j = arr.length-1;

        while(i<j){
            char temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }
    public static void main(String[] args) {
        char[] arr = {'k','r','i', 's','h','n','a'};
        ReverseString(arr);
        for(char c : arr){
            System.out.print(c);
        }
        System.out.println(" ");
    }
    
}
