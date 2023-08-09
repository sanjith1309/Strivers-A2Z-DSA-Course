public class Solution
{
    public static int[] printNos(int x) {
        return printf(x,0,new int[x]);
    }
    public static int[] printf(int i,int x,int[] arr){
        if(i==0){
            return arr;
        }
        arr[x]=i;
        return printf(i-1,x+1,arr);
    }
}
