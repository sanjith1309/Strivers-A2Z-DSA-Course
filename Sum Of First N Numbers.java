public class Solution {
    public static int sumFirstN(int n) {
        int tot=1;
        return sum(1,n,tot);
    }
    public static int sum(int i,int n,int tot){
        if(i==n){
            return tot;
        }
        else{
            tot+=i+1;
            return sum(i+1,n,tot);
        }
    }
}
