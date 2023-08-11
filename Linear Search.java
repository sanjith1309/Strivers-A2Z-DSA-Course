import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                f=1;
                return i;
                
            }
        }
        return -1;
    }
}
