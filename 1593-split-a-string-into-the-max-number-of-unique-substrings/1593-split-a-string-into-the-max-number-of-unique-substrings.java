class Solution {
    int max = 0;
    public int maxUniqueSplit(String s) {
        backTrack(s, 0, new HashSet<>());
        return max;
    }
   
    private void backTrack(String s, int start, Set<String> set) {
        if(start==s.length()){
            max=Math.max(max,set.size());
        }else{
            for(int i=start+1;i<=s.length();i++){
                String st=s.substring(start,i);
                if(set.add(st)){
                    backTrack(s,i,set);
                    set.remove(st);
                }
            }
        }
    }
}