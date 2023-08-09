import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        nums(0,n);
    }
    public static void nums(int i,int n){
        if(i==n){
            return;
        }
        else{
            System.out.print("Coding Ninjas ");
            nums(i+1,n);
        }
    }

}
