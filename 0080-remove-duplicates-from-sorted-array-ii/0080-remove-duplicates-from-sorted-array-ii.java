class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int count=0, indx=1;
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]) count++;
            else count=0;
            
            if(count<=1){
                nums[indx++]=nums[i];
            }
        }
        return indx;
    }
}