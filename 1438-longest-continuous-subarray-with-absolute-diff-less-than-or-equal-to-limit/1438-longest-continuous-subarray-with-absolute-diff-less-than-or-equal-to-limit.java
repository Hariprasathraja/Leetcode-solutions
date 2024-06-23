class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int res=1;
        TreeSet<Integer> set=new TreeSet<>((a,b)->nums[a]==nums[b]?a-b:nums[a]-nums[b]);
        int left=0;
        set.add(0);
        for(int i=1;i<nums.length;i++){
            set.add(i);
            while(nums[set.last()]-nums[set.first()]>limit){
                set.remove(left++);
            }
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}