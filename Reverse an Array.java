public class Solution {
    public static int[] reverseArray(int n, int []nums) {
       int[] arr = new int[n];
       int j=0;
       for(int i=n-1;i>=0;i--){
           arr[j]=nums[i];
           j++;
       }
       return arr;

    }
}
