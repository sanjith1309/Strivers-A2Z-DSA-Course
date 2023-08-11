import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int lar=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;

    }
}
