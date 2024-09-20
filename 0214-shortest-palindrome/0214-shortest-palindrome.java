class Solution {
    public String shortestPalindrome(String s) {
        if(s==null || s.length()<=1) return s;
        int i=0, n=s.length();
        for(int j=n-1;j>-1;j--){
            if(s.charAt(i)==s.charAt(j)) i++;
        }
        if(i==n) return s;
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        
        return prefix + mid + suffix;
    }
}