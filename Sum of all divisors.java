import java.util.ArrayList;

public class Solution {
    public static int sumOfAllDivisors(int n){
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count+=j;
                }
            }
        }
        
        return count;
    }
}
