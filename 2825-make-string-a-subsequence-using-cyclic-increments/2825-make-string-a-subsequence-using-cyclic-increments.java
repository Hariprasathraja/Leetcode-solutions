class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        while(i<str1.length()&& j<str2.length()){
            int c=str1.charAt(i)-'a';
            int comp=str2.charAt(j)-'a';
            if(c==comp||(c+1)%26==comp){
                j++;
            }
            i++;
        }
        return j==str2.length();
    }
}