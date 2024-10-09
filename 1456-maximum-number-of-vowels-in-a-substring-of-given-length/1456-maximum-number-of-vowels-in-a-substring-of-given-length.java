class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int max=0, count=0, left=0;
        for(int i=0;i<s.length();i++){
            if(i>k-1) {
                if(set.contains(s.charAt(left++))) count--;
            }
            if(set.contains(s.charAt(i))){
                count++;
                max=Math.max(max,count);
            }
        }
        return max;
    }
}