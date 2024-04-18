class Solution {
    public boolean rotateString(String s, String goal) {
    if(s.length()!=goal.length()){
        return false;
    }
    if(s.equals(goal)){
        return true;
    }
    int len=goal.length();
    while(len>0){
        if(s.equals(goal)){
            return true;
        }
        s=s.substring(1)+s.charAt(0);
        len--;
    }
    return false;
    }
}