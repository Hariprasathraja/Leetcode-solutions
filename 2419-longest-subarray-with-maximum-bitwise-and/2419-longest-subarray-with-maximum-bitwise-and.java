class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int currentLen=0, maxLen=0;
        for(int i:nums){
            if(i==max){
                currentLen++;
                maxLen=Math.max(maxLen,currentLen);
            }else{
                currentLen=0;
            }
        }
        return maxLen;
    }
}