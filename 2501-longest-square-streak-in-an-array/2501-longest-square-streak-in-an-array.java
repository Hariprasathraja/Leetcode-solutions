class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
        for(int i:nums) set.add((long)i);
        
        int res=-1;
        for(int i:nums){
            int count=1;
            long tem=(long)i;
            while(set.contains(tem*tem)){
                count++;
                tem=tem*tem;
                res=Math.max(res,count);
            }
        }
        return res;
    }
}