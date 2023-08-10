public class Solution {
    public static boolean isPalindrome(String str) {
        String a = "";
        for(int i=str.length()-1;i>=0;i--){
            a=a+str.charAt(i);
        }
        if (a.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}
