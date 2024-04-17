class Solution {
    public boolean canConstruct(String ran, String mag) {
    int[] ar=new int[26];
     for (int i = 0; i < mag.length(); i++) {
            ar[mag.charAt(i) - 'a']++;
        }
    for (int i = 0; i < ran.length(); i++) {
        if(--ar[ran.charAt(i)-'a'] < 0) {
            return false;
           }
        }
    return true;
    }
}