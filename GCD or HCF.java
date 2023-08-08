public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int s = Math.min(m,n);
        int fac=0;
        for(int i=1;i<=s;i++){
            if (m%i==0 && n%i==0){
                fac=i;
            }
        }
        return fac;
    }
}
