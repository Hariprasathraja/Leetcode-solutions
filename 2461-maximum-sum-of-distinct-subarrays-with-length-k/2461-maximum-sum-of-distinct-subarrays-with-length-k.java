class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        long res=map.size()<k?0:sum;
        int j=0;
        for(int i=k;i<nums.length;i++){
            if(map.get(nums[j])!=null && map.get(nums[j])>1){
                map.put(nums[j],map.get(nums[j])-1);
            }else{
                map.remove(nums[j]);
            }
            sum-=nums[j];
            j++;
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.size()==k){
                res=Math.max(res,sum);
            }
        }
        return res;
    }
}