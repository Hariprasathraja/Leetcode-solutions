class Solution {
    public char findTheDifference(String s, String t) {
        char c=t.charAt(t.length()-1);
        for(int i=0;i<t.length()-1;i++){
            c^=s.charAt(i);
            c^=t.charAt(i);
        }
        return c;
    }
}