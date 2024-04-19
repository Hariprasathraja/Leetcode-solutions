class Solution {
    public int lengthOfLongestSubstring(String s) {
    if(s.length()<2){
        return s.length();
    }
    int left=0,i=0,res=0;
    Set<Character>set=new HashSet<>();
    while(i<s.length()){
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            res=Math.max(res,i-left+1);
            i++;
        }else{
            set.remove(s.charAt(left));
            left++;
        }
    }
    return res;
    }
}