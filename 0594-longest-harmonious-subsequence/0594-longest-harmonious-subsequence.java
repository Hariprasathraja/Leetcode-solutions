class Solution {
    public int findLHS(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int left=0,right=1;
        int count=0;
        while(right<nums.length){
            int diff=nums[right]-nums[left];
            if(diff==1){
                count=Math.max(count,right-left+1);
            }
            if(diff<=1){
                right++;
            }else{
                left++;
            }
        }
        return count;
    }
}