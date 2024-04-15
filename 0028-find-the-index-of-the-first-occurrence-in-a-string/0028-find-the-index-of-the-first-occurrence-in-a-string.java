class Solution {
    public int strStr(String hay, String n) {
        if(hay.contains(n)){
            return hay.indexOf(n);
        }
        return -1;
    }
}