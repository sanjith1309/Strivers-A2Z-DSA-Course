public class Solution {
    public static int dataTypes(String type) {
        int a=0;
        if(type.equalsIgnoreCase("Long") || type.equalsIgnoreCase("Double")){
            a=8;
        }
        else if(type.equalsIgnoreCase("Float") || type.equals("Integer")){
            a=4;
        }
        else if(type.equalsIgnoreCase("Character")){
            a=1;
        }
        return a;
    }
}
