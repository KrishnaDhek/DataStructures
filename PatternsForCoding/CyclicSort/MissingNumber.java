package PatternsForCoding.CyclicSort;

public class MissingNumber {
    public static int missingNum(int[] num){
       int i =0;
       int n = num.length;

       while(i<n){
       int position = num[i];

        if(num[i]<n && num[i]!= num[position]){
            swap(num, i, position);
        }
        else{
            i++;
        }
       }
       for(int j = 0; j<n; j++){
        if(num[j]!=j)
        return j;
       }
       return n;
    }
       public static void swap(int[] num, int i, int position){
        int temp = num[i];
        num[i] = num[position];
        num[position]= temp;
       }
    
    public static void main(String[] args) {
        int[] num = {0,2,5,1,8,9,7,3,4};
        System.out.println("Missing number in the array "+missingNum(num));
    }
}
