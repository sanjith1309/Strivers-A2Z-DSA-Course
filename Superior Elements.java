mport java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(a[a.length-1]);
        int flag=0;
        for (int i = a.length-2; i>=0 ;i--){
            flag=1;
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                arr.add(a[i]);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}
