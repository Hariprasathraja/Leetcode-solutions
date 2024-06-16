class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        
        Arrays.sort(nums);
        int c=1,max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]-nums[i-1]==1){
                    c++;
                }else{
                    max=Math.max(c,max);
                    c=1;  
                }
            }
        }
        return Math.max(c,max);
    }
}