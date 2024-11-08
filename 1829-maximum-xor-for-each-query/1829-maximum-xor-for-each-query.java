class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int tot=0;
        for(int i: nums){
            tot^=i;
        }
        int mask=(1<<maximumBit)-1;
        int[] res=new int[nums.length];
        int ind=0;
        for(int i=nums.length-1;i>=0;i--){
            res[ind++]=tot^mask;
            tot^=nums[i];
        }
        return res;
    }
}