import java.util.*;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int secmax;
        int secmin;
        Arrays.sort(a);
        secmin=a[1];
        secmax=a[n-2];
        int[] arr = new int[2];
        arr[1]=secmin;
        arr[0]=secmax;
        return arr;
    }
}
