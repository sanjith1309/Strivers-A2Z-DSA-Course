import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] c = new int[a.length+b.length];
        int i=0;
        for(i=0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int j=0;j<b.length;j++){
            c[i] = b[j];
            i++;
        }
        for(int k=0;k<c.length;k++)
        {
            if(!arr.contains(c[k])){
                arr.add(c[k]);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
