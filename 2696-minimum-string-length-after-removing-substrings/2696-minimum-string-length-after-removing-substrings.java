class Solution {
    public int minLength(String s) {
        while(true){
            if(s.contains("AB")) s=s.replace("AB","");
            else if(s.contains("CD")) s=s.replace("CD","");
            else break;
        }
        return s.length();
    }
}