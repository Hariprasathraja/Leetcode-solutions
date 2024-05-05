class Solution {
    public int longestPalindrome(String s) {
        Set<Character>palin=new HashSet<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(palin.contains(s.charAt(i))){
                palin.remove(s.charAt(i));
                count++;
            }else palin.add(s.charAt(i));
        }
        return count=count*2+(palin.isEmpty()?0:1);
    }
}