public class Solution {
    public static int[] printNos(int x) {
        return printnum(0,x,new int[x]);
    }
    public static int[] printnum(int i,int x,int[] arr){
        if(i==x){
            return arr;
        }
        else{
            arr[i]=i+1;
            return printnum(i+1,x,arr);
        }
    }
}
