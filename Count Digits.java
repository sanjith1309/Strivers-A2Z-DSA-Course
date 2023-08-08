import java.util.ArrayList;

public class Solution {
    public static int countDigits(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int num = n;
        while(n>0){
            int a = n%10;
            arr.add(a);
            n=n/10;
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            
            if(arr.get(i)!=0 && num%arr.get(i)==0){
                count++;
            }
        }
        return count;
        
    }
}
