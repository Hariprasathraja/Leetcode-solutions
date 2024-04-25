class Solution {
    public boolean isSubsequence(String s, String t) {
    if(s.length()==0){
        return true;
    }
    int slen=0,tlen=0;
    while(tlen<t.length()){
        if(s.charAt(slen)==t.charAt(tlen)){
            slen++;
            if(slen==s.length()){
                return true;
            }
        }
        tlen++;
    }
    return false;
    }
}