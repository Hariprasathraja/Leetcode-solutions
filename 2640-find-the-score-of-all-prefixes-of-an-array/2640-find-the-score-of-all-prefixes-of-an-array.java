class Solution {
    public long[] findPrefixScore(int[] nums) {
    long[] ar=new long[nums.length];
    long max=0,sum=0;
    for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        sum+=max+nums[i];
        ar[i]=sum;
    }
    return ar;
    }
}