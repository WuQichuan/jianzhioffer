package code_03_tihuankongge;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
