class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0,s2=0;
        for(int i=0;i<t.length()-1;i++){
            s1+=s.charAt(i);
            s2+=t.charAt(i);
        }
        s2+=t.charAt(t.length()-1);
        return (char)(s2-s1);
    }
}