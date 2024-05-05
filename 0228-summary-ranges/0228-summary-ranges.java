class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(i<nums.length-1&&nums[i]+1==nums[i+1]){
                i++;
            }
            if(n!=nums[i]) range.add(n+"->"+nums[i]);
            else range.add(n+"");
        }
        return range;
    }
}