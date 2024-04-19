class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s.length()<2){
        return s.length();
    }
    int left=0,res=0;
    Set<Character>set=new HashSet<>();
    for(char i:s.toCharArray()){
        while(set.contains(i)){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(i);
        res=Math.max(res,set.size());
    }
    return res;
    }
}