public class Solution {
    public static String compareIfElse(int a, int b) {
        if(a>b){
            return("greater");
        }
        else if(a==b){
            return("equal");
        }
        else{
            return("smaller");
        }
    }
}
