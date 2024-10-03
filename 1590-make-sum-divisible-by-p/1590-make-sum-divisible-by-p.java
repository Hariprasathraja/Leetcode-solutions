class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum=0;
        for(int i=0;i<nums.length;i++) totalSum+=nums[i];
        
        if(totalSum%p==0) return 0;
        int rem=(int)(totalSum%p);
        
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int minLen=nums.length;
        totalSum=0;
        
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            int curRem=(int) (totalSum%p);
            
            int target=curRem-rem;
            if(target<0) target+=p;
            if(map.containsKey(target)){
                minLen=Math.min(minLen,i-map.get(target));
            }
            map.put(curRem,i);
        }
        
        return minLen==nums.length? -1 : minLen;
    }
}