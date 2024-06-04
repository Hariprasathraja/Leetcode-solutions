class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char i: s.toCharArray()){
            if(set.contains(i)){
                set.remove(i);
                count++;
            }else{
                set.add(i);
            }
        }
        return count*2+ (set.isEmpty()?0:1);
    }
}