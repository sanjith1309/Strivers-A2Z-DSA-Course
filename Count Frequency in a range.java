public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] result = new int[n];
        int j=0;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int k=0;k<nums.length;k++){
                if(i==nums[k]){
                    count++;
                }
            }
            result[j]=count;
            j++;
        }
        return result;
    }
}
